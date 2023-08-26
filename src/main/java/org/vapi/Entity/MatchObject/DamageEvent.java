package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DamageEvent {
    @JsonProperty("receiver_puuid")
    private String receiverPuuid;
    @JsonProperty("receiver_display_name")
    private String receiverRiotID;
    @JsonProperty("receiver_team")
    private String receiverTeam;
    @JsonProperty("bodyshots")
    private int bodyshots;
    @JsonProperty("headshots")
    private int headshost;

    @JsonProperty("legshots")
    private int legshots;

    @JsonProperty("damage")
    private int damage;

    public String getReceiverPuuid() {
        return receiverPuuid;
    }

    public void setReceiverPuuid(String receiverPuuid) {
        this.receiverPuuid = receiverPuuid;
    }

    public String getReceiverRiotID() {
        return receiverRiotID;
    }

    public void setReceiverRiotID(String receiverRiotID) {
        this.receiverRiotID = receiverRiotID;
    }

    public String getReceiverTeam() {
        return receiverTeam;
    }

    public void setReceiverTeam(String receiverTeam) {
        this.receiverTeam = receiverTeam;
    }

    public int getBodyshots() {
        return bodyshots;
    }

    public void setBodyshots(int bodyshots) {
        this.bodyshots = bodyshots;
    }

    public int getHeadshost() {
        return headshost;
    }

    public void setHeadshost(int headshost) {
        this.headshost = headshost;
    }

    public int getLegshots() {
        return legshots;
    }

    public void setLegshots(int legshots) {
        this.legshots = legshots;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "DamageEvent{" +
                "receiverPuuid='" + receiverPuuid + '\'' +
                ", receiverRiotID='" + receiverRiotID + '\'' +
                ", receiverTeam='" + receiverTeam + '\'' +
                ", bodyshots=" + bodyshots +
                ", headshost=" + headshost +
                ", legshots=" + legshots +
                ", damage=" + damage +
                '}';
    }
}
