package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AgentImages {
    @JsonProperty("small")
    private String small;
    @JsonProperty("bust")
    private String bust;
    @JsonProperty("full")
    private String full;
    @JsonProperty("killfeed")
    private String killfeed;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getBust() {
        return bust;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getKillfeed() {
        return killfeed;
    }

    public void setKillfeed(String killfeed) {
        this.killfeed = killfeed;
    }

    @Override
    public String toString() {
        return "AgentImages{" +
                "small='" + small + '\'' +
                ", bust='" + bust + '\'' +
                ", full='" + full + '\'' +
                ", killfeed='" + killfeed + '\'' +
                '}';
    }
}
