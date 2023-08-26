package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Images {

    @JsonProperty("small")
    private String small;
    @JsonProperty("large")
    private String large;

    @JsonProperty("triangle_down")
    private String triangleDown;

    @JsonProperty("triangle_up")
    private String triangleUp;

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

    public String getTriangleDown() {
        return triangleDown;
    }

    public void setTriangleDown(String triangleDown) {
        this.triangleDown = triangleDown;
    }

    public String getTriangleUp() {
        return triangleUp;
    }

    public void setTriangleUp(String triangleUp) {
        this.triangleUp = triangleUp;
    }

    @Override
    public String toString() {
        return "Images{" +
                "small='" + small + '\'' +
                ", large='" + large + '\'' +
                ", triangleDown='" + triangleDown + '\'' +
                ", triangleUp='" + triangleUp + '\'' +
                '}';
    }
}
