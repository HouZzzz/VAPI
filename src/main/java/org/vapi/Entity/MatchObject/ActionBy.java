package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionBy {
    @JsonProperty("puuid")
    private String puuid;

    @JsonProperty("display_name")
    private String riotID;

    @JsonProperty("team")
    private String team;

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getRiotID() {
        return riotID;
    }

    public void setRiotID(String riotID) {
        this.riotID = riotID;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "ActionBy{" +
                "puuid='" + puuid + '\'' +
                ", riotID='" + riotID + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
