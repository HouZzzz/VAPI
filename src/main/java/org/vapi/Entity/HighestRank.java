package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HighestRank {
    @JsonProperty("old")
    private boolean actual;

    @JsonProperty("tier")
    private int tier;
    @JsonProperty("patched_tier")
    private String patchedTier;

    @JsonProperty("season")
    private String season;

    public boolean isActual() {
        return actual;
    }

    public void setActual(boolean actual) {
        this.actual = actual;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getPatchedTier() {
        return patchedTier;
    }

    public void setPatchedTier(String patchedTier) {
        this.patchedTier = patchedTier;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "HighestRank{" +
                "actual=" + actual +
                ", tier=" + tier +
                ", patchedTier='" + patchedTier + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
