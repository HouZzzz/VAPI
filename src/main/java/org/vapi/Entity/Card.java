package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {
    @JsonProperty("small")
    private String small;

    @JsonProperty("large")
    private String large;

    @JsonProperty("wide")
    private String wide;
    @JsonProperty("id")
    private String id;

    public Card() {
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
