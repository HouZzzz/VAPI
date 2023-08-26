package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActWin {
    @JsonProperty("patched_tier")
    private String patchedTier;

    @JsonProperty("tier")
    private int tier;

    public String getPatchedTier() {
        return patchedTier;
    }

    public void setPatchedTier(String patchedTier) {
        this.patchedTier = patchedTier;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "ActWin{" +
                "patchedTier='" + patchedTier + '\'' +
                ", tier=" + tier +
                '}';
    }
}
