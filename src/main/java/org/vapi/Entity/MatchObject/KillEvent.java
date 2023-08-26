package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KillEvent {

    @JsonProperty("kill_time_in_round")
    private long timeInRound;
    @JsonProperty("kill_time_in_match")
    private long timeInMatch;

    @JsonProperty("round")
    private int round;

    @JsonProperty("killer_puuid")
    private String killerPuuid;
    @JsonProperty("killer_display_name")
    private String killerRiotID;
    @JsonProperty("killer_team")
    private String killerTeam;
    @JsonProperty("victim_puuid")
    private String victimPuuid;
    @JsonProperty("victim_display_name")
    private String victimRiotID;
    @JsonProperty("victim_team")
    private String victimTeam;
    @JsonProperty("victim_death_location")
    private Location deathLocation;
    @JsonProperty("damage_weapon_id")
    private String weaponID;
    @JsonProperty("damage_weapon_name")
    private String weaponName;
    @JsonProperty("damage_weapon_assets")
    private WeaponAssets weaponAssets;
    @JsonProperty("secondary_fire_mode")
    private boolean secondaryFireMode;
    @JsonProperty("player_locations_on_kill")
    private List<PlayerLocation> locationsOnKill;
    @JsonProperty("assistants")
    private List<Assistant> assistants;

    public long getTimeInRound() {
        return timeInRound;
    }

    public void setTimeInRound(long timeInRound) {
        this.timeInRound = timeInRound;
    }

    public long getTimeInMatch() {
        return timeInMatch;
    }

    public void setTimeInMatch(long timeInMatch) {
        this.timeInMatch = timeInMatch;
    }

    public String getKillerPuuid() {
        return killerPuuid;
    }

    public void setKillerPuuid(String killerPuuid) {
        this.killerPuuid = killerPuuid;
    }

    public String getKillerRiotID() {
        return killerRiotID;
    }

    public void setKillerRiotID(String killerRiotID) {
        this.killerRiotID = killerRiotID;
    }

    public String getKillerTeam() {
        return killerTeam;
    }

    public void setKillerTeam(String killerTeam) {
        this.killerTeam = killerTeam;
    }

    public String getVictimPuuid() {
        return victimPuuid;
    }

    public void setVictimPuuid(String victimPuuid) {
        this.victimPuuid = victimPuuid;
    }

    public String getVictimRiotID() {
        return victimRiotID;
    }

    public void setVictimRiotID(String victimRiotID) {
        this.victimRiotID = victimRiotID;
    }

    public String getVictimTeam() {
        return victimTeam;
    }

    public void setVictimTeam(String victimTeam) {
        this.victimTeam = victimTeam;
    }

    public Location getDeathLocation() {
        return deathLocation;
    }

    public void setDeathLocation(Location deathLocation) {
        this.deathLocation = deathLocation;
    }

    public String getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(String weaponID) {
        this.weaponID = weaponID;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponAssets getWeaponAssets() {
        return weaponAssets;
    }

    public void setWeaponAssets(WeaponAssets weaponAssets) {
        this.weaponAssets = weaponAssets;
    }

    public boolean isSecondaryFireMode() {
        return secondaryFireMode;
    }

    public void setSecondaryFireMode(boolean secondaryFireMode) {
        this.secondaryFireMode = secondaryFireMode;
    }

    public List<PlayerLocation> getLocationsOnKill() {
        return locationsOnKill;
    }

    public void setLocationsOnKill(List<PlayerLocation> locationsOnKill) {
        this.locationsOnKill = locationsOnKill;
    }

    public List<Assistant> getAssistants() {
        return assistants;
    }

    public void setAssistants(List<Assistant> assistants) {
        this.assistants = assistants;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "KillEvent{" +
                "timeInRound=" + timeInRound +
                ", timeInMatch=" + timeInMatch +
                ", killerPuuid='" + killerPuuid + '\'' +
                ", killerRiotID='" + killerRiotID + '\'' +
                ", killerTeam='" + killerTeam + '\'' +
                ", victimPuuid='" + victimPuuid + '\'' +
                ", victimRiotID='" + victimRiotID + '\'' +
                ", victimTeam='" + victimTeam + '\'' +
                ", deathLocation=" + deathLocation +
                ", weaponID='" + weaponID + '\'' +
                ", weaponName='" + weaponName + '\'' +
                ", weaponAssets=" + weaponAssets +
                ", secondaryFireMode=" + secondaryFireMode +
                ", locationsOnKill=" + locationsOnKill +
                ", assistants=" + assistants +
                '}';
    }
}