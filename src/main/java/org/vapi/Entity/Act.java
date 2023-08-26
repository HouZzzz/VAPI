package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Act {
    @JsonProperty("wins")
    private int wins;

    @JsonProperty("number_of_games")
    private int games;

    @JsonProperty("final_rank")
    private int finalRank;

    @JsonProperty("final_rank_patched")
    private String finalRankPatched;

    @JsonProperty("old")
    private boolean actual;

    @JsonProperty("act_rank_wins")
    private List<ActWin> actWins;

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getFinalRank() {
        return finalRank;
    }

    public void setFinalRank(int finalRank) {
        this.finalRank = finalRank;
    }

    public String getFinalRankPatched() {
        return finalRankPatched;
    }

    public void setFinalRankPatched(String finalRankPatched) {
        this.finalRankPatched = finalRankPatched;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public List<ActWin> getActWins() {
        return actWins;
    }

    public void setActWins(List<ActWin> actWins) {
        this.actWins = actWins;
    }
}
