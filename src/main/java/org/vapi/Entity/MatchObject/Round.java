package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Round {
    @JsonProperty("winning_team")
    private String winningTeam;

    @JsonProperty("end_type")
    private String endType;

    @JsonProperty("bomb_planted")
    private boolean bombPlanted;

    @JsonProperty("bomb_defused")
    private boolean bombDefused;

    @JsonProperty("plant_events")
    private PlantEvent plantEvent;

    @JsonProperty("defuse_events")
    private DefuseEvent defuseEvent;

    @JsonProperty("player_stats")
    private List<PlayerStats> playerStats;


    public String getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(String winningTeam) {
        this.winningTeam = winningTeam;
    }

    public String getEndType() {
        return endType;
    }

    public void setEndType(String endType) {
        this.endType = endType;
    }

    public boolean isBombPlanted() {
        return bombPlanted;
    }

    public void setBombPlanted(boolean bombPlanted) {
        this.bombPlanted = bombPlanted;
    }

    public boolean isBombDefused() {
        return bombDefused;
    }

    public void setBombDefused(boolean bombDefused) {
        this.bombDefused = bombDefused;
    }

    public PlantEvent getPlantEvent() {
        return plantEvent;
    }

    public void setPlantEvent(PlantEvent plantEvent) {
        this.plantEvent = plantEvent;
    }

    public DefuseEvent getDefuseEvent() {
        return defuseEvent;
    }

    public void setDefuseEvent(DefuseEvent defuseEvent) {
        this.defuseEvent = defuseEvent;
    }

    public List<PlayerStats> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStats> playerStats) {
        this.playerStats = playerStats;
    }

    @Override
    public String toString() {
        return "Round{" +
                "winningTeam='" + winningTeam + '\'' +
                ", endType='" + endType + '\'' +
                ", bombPlanted=" + bombPlanted +
                ", bombDefused=" + bombDefused +
                ", plantEvent=" + plantEvent +
                ", defuseEvent=" + defuseEvent +
                ", playerStats=" + playerStats +
                '}';
    }
}
