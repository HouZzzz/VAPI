package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    @JsonProperty("map")
    private String map; // todo enum

    @JsonProperty("game_version")
    private String gameVersion;

    @JsonProperty("game_length")
    private int length;

    @JsonProperty("game_start")
    private long gameStart;

    @JsonProperty("game_start_patched")
    private String gameStartPatched;

    @JsonProperty("rounds_played")
    private short roundsPlayed;

    @JsonProperty("mode")
    private String mode; // todo enum

    @JsonProperty("queue")
    private String queue; // todo enum

    @JsonProperty("season_id")
    private String seasonID;

    @JsonProperty("matchid")
    private String matchID;

    @JsonProperty("region")
    private String region; //todo enum

    @JsonProperty("cluster")
    private String cluster;

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public void setGameVersion(String gameVersion) {
        this.gameVersion = gameVersion;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getGameStart() {
        return gameStart;
    }

    public void setGameStart(long gameStart) {
        this.gameStart = gameStart;
    }

    public String getGameStartPatched() {
        return gameStartPatched;
    }

    public void setGameStartPatched(String gameStartPatched) {
        this.gameStartPatched = gameStartPatched;
    }

    public short getRoundsPlayed() {
        return roundsPlayed;
    }

    public void setRoundsPlayed(short roundsPlayed) {
        this.roundsPlayed = roundsPlayed;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getSeasonID() {
        return seasonID;
    }

    public void setSeasonID(String seasonID) {
        this.seasonID = seasonID;
    }

    public String getMatchID() {
        return matchID;
    }

    public void setMatchID(String matchID) {
        this.matchID = matchID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "map='" + map + '\'' +
                ", gameVersion='" + gameVersion + '\'' +
                ", length=" + length +
                ", gameStart=" + gameStart +
                ", gameStartPatched='" + gameStartPatched + '\'' +
                ", roundsPlayed=" + roundsPlayed +
                ", mode='" + mode + '\'' +
                ", queue='" + queue + '\'' +
                ", seasonID='" + seasonID + '\'' +
                ", matchID='" + matchID + '\'' +
                ", region='" + region + '\'' +
                ", cluster='" + cluster + '\'' +
                '}';
    }
}
