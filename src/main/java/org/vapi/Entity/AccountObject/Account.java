package org.vapi.Entity.AccountObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vapi.Entity.MatchObject.Match;
import org.vapi.ValorantAPI;

import java.util.List;

public class Account {
    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("region")
    private String region;

    @JsonProperty("account_level")
    private int level;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tag")
    private String tag;

    @JsonProperty("card")
    private Card card;

    @JsonProperty("last_update")
    private String lastUpdate;

    @JsonProperty("last_update_raw")
    private long lastUpdateTimestamp;

    @JsonProperty("current_data")
    private CurrentData currentData;

    @JsonProperty("highest_rank")
    private HighestRank highestRank;

    @JsonProperty("by_season")
    private BySeason bySeason;

    private List<Match> matches;

    public Account() {
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public long getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(long lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public CurrentData getCurrentData() {
        return currentData;
    }

    public void setCurrentData(CurrentData currentData) {
        this.currentData = currentData;
    }

    public HighestRank getHighestRank() {
        return highestRank;
    }

    public void setHighestRank(HighestRank highestRank) {
        this.highestRank = highestRank;
    }

    public BySeason getBySeason() {
        return bySeason;
    }

    public void setBySeason(BySeason bySeason) {
        this.bySeason = bySeason;
    }

    public List<Match> getMatches() {
        if (matches == null) {
            try {
                String json = ValorantAPI.sendRequest("/v3/matches/eu/%s/%s?filter=competitive&size=10".formatted(name, tag));
                System.out.println("fetched");
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonNode = objectMapper.readTree(json);

                String matchesJson = jsonNode.get("data").toString();

                matches = objectMapper.readValue(matchesJson, new TypeReference<>() {});
            } catch (JsonProcessingException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Account{" +
                "puuid='" + puuid + '\'' +
                ", region='" + region + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", card=" + card +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                ", currentData=" + currentData +
                ", highestRank=" + highestRank +
                ", bySeason=" + bySeason +
                '}';
    }
}
