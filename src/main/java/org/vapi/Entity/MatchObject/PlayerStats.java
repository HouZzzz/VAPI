package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStats {
    @JsonProperty("player_puuid")
    private String puuid;

    @JsonProperty("player_display_name")
    private String riotID;

    @JsonProperty("player_team")
    private String team;

    @JsonProperty("damage_events")
    private List<DamageEvent> damageEvents;

    @JsonProperty("damage")
    private int damage;

    @JsonProperty("bodyshots")
    private int bodyshots;

    @JsonProperty("headshots")
    private int headshots;

    @JsonProperty("legshots")
    private int legshots;

    @JsonProperty("kill_events")
    private List<KillEvent> killEvents;

    @JsonProperty("kills")
    private int kills;

    @JsonProperty("score")
    private int score;

    @JsonProperty("economy")
    private RoundEconomy roundEconomy;

    @JsonProperty("was_afk")
    private boolean afk;

    @JsonProperty("was_penalized")
    private boolean penalized;

    @JsonProperty("stayed_in_spawn")
    private boolean stayedInSpawn;

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

    public List<DamageEvent> getDamageEvents() {
        return damageEvents;
    }

    public void setDamageEvents(List<DamageEvent> damageEvents) {
        this.damageEvents = damageEvents;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

    public List<KillEvent> getKillEvents() {
        return killEvents;
    }

    public void setKillEvents(List<KillEvent> killEvents) {
        this.killEvents = killEvents;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public RoundEconomy getRoundEconomy() {
        return roundEconomy;
    }

    public void setRoundEconomy(RoundEconomy roundEconomy) {
        this.roundEconomy = roundEconomy;
    }

    public boolean isAfk() {
        return afk;
    }

    public void setAfk(boolean afk) {
        this.afk = afk;
    }

    public boolean isPenalized() {
        return penalized;
    }

    public void setPenalized(boolean penalized) {
        this.penalized = penalized;
    }

    public boolean isStayedInSpawn() {
        return stayedInSpawn;
    }

    public void setStayedInSpawn(boolean stayedInSpawn) {
        this.stayedInSpawn = stayedInSpawn;
    }

    @Override
    public String toString() {
        return "PlayerStats{" +
                "puuid='" + puuid + '\'' +
                ", riotID='" + riotID + '\'' +
                ", team='" + team + '\'' +
                ", damageEvents=" + damageEvents +
                ", damage=" + damage +
                ", bodyshots=" + bodyshots +
                ", headshots=" + headshots +
                ", legshots=" + legshots +
                ", killEvents=" + killEvents +
                ", kills=" + kills +
                ", score=" + score +
                ", roundEconomy=" + roundEconomy +
                ", afk=" + afk +
                ", penalized=" + penalized +
                ", stayedInSpawn=" + stayedInSpawn +
                '}';
    }
}
