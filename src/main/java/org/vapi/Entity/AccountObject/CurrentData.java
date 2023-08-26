package org.vapi.Entity.AccountObject;


import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentData {
    @JsonProperty("currenttier")
    private int currentTier;

    @JsonProperty("currenttierpatched")
    private String currentTierPatched;

    @JsonProperty("images")
    private Images images;

    @JsonProperty("ranking_in_tier")
    private int eloInTier;

    @JsonProperty("elo")
    private int elo;

    @JsonProperty("mmr_change_to_last_game")
    private int lastGameEloDelta;

    @JsonProperty("games_needed_for_rating")
    private int gamesNeededForRating;

    @JsonProperty("old")
    private boolean actual;

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

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public int getEloInTier() {
        return eloInTier;
    }

    public void setEloInTier(int eloInTier) {
        this.eloInTier = eloInTier;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public int getGamesNeededForRating() {
        return gamesNeededForRating;
    }

    public void setGamesNeededForRating(int gamesNeededForRating) {
        this.gamesNeededForRating = gamesNeededForRating;
    }

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public int getLastGameEloDelta() {
        return lastGameEloDelta;
    }

    public void setLastGameEloDelta(int lastGameEloDelta) {
        this.lastGameEloDelta = lastGameEloDelta;
    }

    @Override
    public String toString() {
        return "CurrentData{" +
                "currentTier=" + currentTier +
                ", currentTierPatched='" + currentTierPatched + '\'' +
                ", images=" + images +
                ", eloInTier=" + eloInTier +
                ", elo=" + elo +
                ", lastGameEloDelta=" + lastGameEloDelta +
                ", gamesNeededForRating=" + gamesNeededForRating +
                ", actual=" + actual +
                '}';
    }
}
