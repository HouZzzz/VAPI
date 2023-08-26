package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Teams {
    @JsonProperty("red")
    private Team red;

    @JsonProperty("blue")
    private Team blue;

    public Team getRed() {
        return red;
    }

    public void setRed(Team red) {
        this.red = red;
    }

    public Team getBlue() {
        return blue;
    }

    public void setBlue(Team blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "Teams{" +
                "red=" + red +
                ", blue=" + blue +
                '}';
    }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Team {
    @JsonProperty("has_won")
    private boolean won;

    @JsonProperty("rounds_won")
    private int roundsWon;

    @JsonProperty("rounds_lost")
    private int roundsLost;

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }

    public int getRoundsLost() {
        return roundsLost;
    }

    public void setRoundsLost(int roundsLost) {
        this.roundsLost = roundsLost;
    }

    @Override
    public String toString() {
        return "Team{" +
                "won=" + won +
                ", roundsWon=" + roundsWon +
                ", roundsLost=" + roundsLost +
                '}';
    }
}