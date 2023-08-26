package org.vapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vapi.Entity.AccountObject.Account;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class ValorantAPI {
    private String DOMAIN = "https://api.henrikdev.xyz/valorant";
    private String key;

    private ObjectMapper objectMapper = new ObjectMapper();

    public ValorantAPI() {}

    public ValorantAPI(String key) {this.key = key;}


    public Optional<Account> fetchAccount(String riotID, boolean forceUpdate) {
        String[] split = riotID.split("#");
        // todo validate riot id and throw incorrect exception if not valid

        String path = "/v1/account/%s/%s?force=%s"
                .formatted(
                        split[0],
                        split[1],
                        forceUpdate
                );

        try {
            JsonNode jsonNode = objectMapper.readTree(sendRequest(path));
            int status = jsonNode.get("status").asInt();
            if (status != 200) {
                System.out.println("not 200");
                return Optional.empty();
            }

            String account = jsonNode.get("data").toString();

            Account byRiotIDContainer = objectMapper.readValue(account, new TypeReference<Account>() {});

            path = "/v2/by-puuid/mmr/eu/" + byRiotIDContainer.getPuuid();
            jsonNode = objectMapper.readTree(sendRequest(path));
            status = jsonNode.get("status").asInt();
            if (status != 200) {
                System.out.println("not 200");
                return Optional.empty();
            }
            account = jsonNode.get("data").toString();

            Account filledAccount = objectMapper.readValue(account, new TypeReference<Account>() {});

            filledAccount.setPuuid(byRiotIDContainer.getPuuid());
            filledAccount.setRegion(byRiotIDContainer.getRegion());
            filledAccount.setLevel(byRiotIDContainer.getLevel());
            filledAccount.setCard(byRiotIDContainer.getCard());
            filledAccount.setLastUpdate(byRiotIDContainer.getLastUpdate());
            filledAccount.setLastUpdateTimestamp(byRiotIDContainer.getLastUpdateTimestamp());


            return Optional.ofNullable(filledAccount);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
            return Optional.empty();
        }
    }

    private String sendRequest(String path) {
        try {
            URL url = new URL(DOMAIN + path);
            System.out.println("sending request to " + url);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            connection.setRequestProperty("Authorization", key);

            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder responseBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }

            return responseBuilder.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "";
        }
    }
}
