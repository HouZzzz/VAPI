package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeaponAssets {
    @JsonProperty("display_icon")
    private String displayIcon;

    @JsonProperty("killfeed_icon")
    private String killfeedIcon;

    public String getDisplayIcon() {
        return displayIcon;
    }

    public void setDisplayIcon(String displayIcon) {
        this.displayIcon = displayIcon;
    }

    public String getKillfeedIcon() {
        return killfeedIcon;
    }

    public void setKillfeedIcon(String killfeedIcon) {
        this.killfeedIcon = killfeedIcon;
    }

    @Override
    public String toString() {
        return "WeaponAssets{" +
                "displayIcon='" + displayIcon + '\'' +
                ", killfeedIcon='" + killfeedIcon + '\'' +
                '}';
    }
}
