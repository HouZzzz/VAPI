package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DefuseEvent {
    @JsonProperty("defuse_location")
    private Location defuseLocation;

    @JsonProperty("defused_by")
    private ActionBy defusedBy;

    @JsonProperty("defuse_time_in_round")
    private int defuseTimeInRound;

    @JsonProperty("player_locations_on_defuse")
    private List<PlayerLocation> locationsOnDefuse;

    public Location getDefuseLocation() {
        return defuseLocation;
    }

    public void setDefuseLocation(Location defuseLocation) {
        this.defuseLocation = defuseLocation;
    }

    public ActionBy getDefusedBy() {
        return defusedBy;
    }

    public void setDefusedBy(ActionBy defusedBy) {
        this.defusedBy = defusedBy;
    }

    public int getDefuseTimeInRound() {
        return defuseTimeInRound;
    }

    public void setDefuseTimeInRound(int defuseTimeInRound) {
        this.defuseTimeInRound = defuseTimeInRound;
    }

    public List<PlayerLocation> getLocationsOnDefuse() {
        return locationsOnDefuse;
    }

    public void setLocationsOnDefuse(List<PlayerLocation> locationsOnDefuse) {
        this.locationsOnDefuse = locationsOnDefuse;
    }

    @Override
    public String toString() {
        return "DefuseEvent{" +
                "defuseLocation=" + defuseLocation +
                ", defusedBy=" + defusedBy +
                ", defuseTimeInRound=" + defuseTimeInRound +
                ", locationsOnDefuse=" + locationsOnDefuse +
                '}';
    }
}
