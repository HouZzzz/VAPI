package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PlantEvent {
    @JsonProperty("plant_location")
    private Location plantLocation;
    @JsonProperty("planted_by")
    private ActionBy plantedBy;
    @JsonProperty("plant_site")
    private String plantSite;
    @JsonProperty("plant_time_in_round")
    private long plantTimeInRound;
    @JsonProperty("player_locations_on_plant")
    private List<PlayerLocation> playersLocationsOnPlant;

    public Location getPlantLocation() {
        return plantLocation;
    }

    public void setPlantLocation(Location plantLocation) {
        this.plantLocation = plantLocation;
    }

    public ActionBy getPlantedBy() {
        return plantedBy;
    }

    public void setPlantedBy(ActionBy plantedBy) {
        this.plantedBy = plantedBy;
    }

    public String getPlantSite() {
        return plantSite;
    }

    public void setPlantSite(String plantSite) {
        this.plantSite = plantSite;
    }

    public long getPlantTimeInRound() {
        return plantTimeInRound;
    }

    public void setPlantTimeInRound(long plantTimeInRound) {
        this.plantTimeInRound = plantTimeInRound;
    }

    public List<PlayerLocation> getPlayersLocationsOnPlant() {
        return playersLocationsOnPlant;
    }

    public void setPlayersLocationsOnPlant(List<PlayerLocation> playersLocationsOnPlant) {
        this.playersLocationsOnPlant = playersLocationsOnPlant;
    }

    @Override
    public String toString() {
        return "PlantEvent{" +
                "plantLocation=" + plantLocation +
                ", plantedBy=" + plantedBy +
                ", plantSite='" + plantSite + '\'' +
                ", plantTimeInRound=" + plantTimeInRound +
                ", playersLocationsOnPlant=" + playersLocationsOnPlant +
                '}';
    }
}
