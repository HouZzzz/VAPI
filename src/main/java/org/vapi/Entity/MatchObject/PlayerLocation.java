package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerLocation {
    @JsonProperty("player_puuid")
    private String puuid;

    @JsonProperty("player_display_name")
    private String riotID;

    @JsonProperty("player_team")
    private String team;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("view_radians")
    private double viewRadians;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getViewRadians() {
        return viewRadians;
    }

    public void setViewRadians(double viewRadians) {
        this.viewRadians = viewRadians;
    }

    @Override
    public String toString() {
        return "PlayerLocation{" +
                "puuid='" + puuid + '\'' +
                ", riotID='" + riotID + '\'' +
                ", team='" + team + '\'' +
                ", location=" + location +
                ", viewRadians=" + viewRadians +
                '}';
    }
}
