package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    @JsonProperty("by_saeson")
    private BySeason bySeason;

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
                '}';
    }
}
