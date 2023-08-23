package org.vapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ValorantAPI {
    private String DOMAIN = "https://api.henrikdev.xyz/valorant";
    private String key;

    public ValorantAPI() {}

    public ValorantAPI(String key) {this.key = key;}

    private String sendRequest(String path) throws IOException {
        URL url = new URL(DOMAIN + path);

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
    }
}
