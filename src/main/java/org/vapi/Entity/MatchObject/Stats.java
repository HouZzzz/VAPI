package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats {
    @JsonProperty("score")
    private int score;
    @JsonProperty("kills")
    private int kills;
    @JsonProperty("deaths")
    private int deaths;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("bodyshots")
    private int bodyshots;
    @JsonProperty("headshots")
    private int headshots;
    @JsonProperty("legshots")
    private int legshots;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getBodyshots() {
        return bodyshots;
    }

    public void setBodyshots(int bodyshots) {
        this.bodyshots = bodyshots;
    }

    public int getHeadshots() {
        return headshots;
    }

    public void setHeadshots(int headshots) {
        this.headshots = headshots;
    }

    public int getLegshots() {
        return legshots;
    }

    public void setLegshots(int legshots) {
        this.legshots = legshots;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "score=" + score +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ", bodyshots=" + bodyshots +
                ", headshots=" + headshots +
                ", legshots=" + legshots +
                '}';
    }
}
