package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    @JsonProperty("puuid")
    private String puuid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("team")
    private String team; // todo enum
    @JsonProperty("level")
    private int level;
    @JsonProperty("character")
    private String agent; // todo enum

    @JsonProperty("currenttier")
    private int currentTier;
    @JsonProperty("currenttierpatched")
    private String currentTierPatched;
    @JsonProperty("player_card")
    private String playerCardID;
    @JsonProperty("player_title")
    private String playerTitleID;

    @JsonProperty("party_id")
    private String partyID;
    @JsonProperty("session_playtime")
    private SessionPlaytime sessionPlaytime;
    @JsonProperty("behavior")
    private Behavior behavior;

    @JsonProperty("ability_casts")
    private AbilityCasts abilityCasts;

    @JsonProperty("assets")
    private Assets assets;

    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("economy")
    private Economy economy;

    @JsonProperty("damage_made")
    private int totalDamageMade;
    @JsonProperty("damage_received")
    private int totalDamageReceived;

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
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

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public int getCurrentTier() {
        return currentTier;
    }

    public void setCurrentTier(int currentTier) {
        this.currentTier = currentTier;
    }

    public String getCurrentTierPatched() {
        return currentTierPatched;
    }

    public void setCurrentTierPatched(String currentTierPatched) {
        this.currentTierPatched = currentTierPatched;
    }

    public String getPlayerCardID() {
        return playerCardID;
    }

    public void setPlayerCardID(String playerCardID) {
        this.playerCardID = playerCardID;
    }

    public String getPlayerTitleID() {
        return playerTitleID;
    }

    public void setPlayerTitleID(String playerTitleID) {
        this.playerTitleID = playerTitleID;
    }

    public String getPartyID() {
        return partyID;
    }

    public void setPartyID(String partyID) {
        this.partyID = partyID;
    }

    public SessionPlaytime getSessionPlaytime() {
        return sessionPlaytime;
    }

    public void setSessionPlaytime(SessionPlaytime sessionPlaytime) {
        this.sessionPlaytime = sessionPlaytime;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehaviour(Behavior behavior) {
        this.behavior = behavior;
    }

    public AbilityCasts getAbilityCasts() {
        return abilityCasts;
    }

    public void setAbilityCasts(AbilityCasts abilityCasts) {
        this.abilityCasts = abilityCasts;
    }

    public Assets getAssets() {
        return assets;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Economy getEconomy() {
        return economy;
    }

    public void setEconomy(Economy economy) {
        this.economy = economy;
    }

    public int getTotalDamageMade() {
        return totalDamageMade;
    }

    public void setTotalDamageMade(int totalDamageMade) {
        this.totalDamageMade = totalDamageMade;
    }

    public int getTotalDamageReceived() {
        return totalDamageReceived;
    }

    public void setTotalDamageReceived(int totalDamageReceived) {
        this.totalDamageReceived = totalDamageReceived;
    }

    @Override
    public String toString() {
        return "Player{" +
                "puuid='" + puuid + '\'' +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", team='" + team + '\'' +
                ", level=" + level +
                ", agent='" + agent + '\'' +
                ", currentTier=" + currentTier +
                ", currentTierPatched='" + currentTierPatched + '\'' +
                ", playerCardID='" + playerCardID + '\'' +
                ", playerTitleID='" + playerTitleID + '\'' +
                ", partyID='" + partyID + '\'' +
                ", sessionPlaytime=" + sessionPlaytime +
                ", behavior=" + behavior +
                ", abilityCasts=" + abilityCasts +
                ", assets=" + assets +
                ", stats=" + stats +
                ", economy=" + economy +
                ", totalDamageMade=" + totalDamageMade +
                ", totalDamageReceived=" + totalDamageReceived +
                '}';
    }
}
