package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Behavior {
    @JsonProperty("afk_rounds")
    private int afkRounds;
    @JsonProperty("friendly_fire")
    private FriendlyFire friendlyFire;

    @JsonProperty("rounds_in_spawn")
    private int roundsInSpawn;

    public int getAfkRounds() {
        return afkRounds;
    }

    public void setAfkRounds(int afkRounds) {
        this.afkRounds = afkRounds;
    }

    public FriendlyFire getFriendlyFire() {
        return friendlyFire;
    }

    public void setFriendlyFire(FriendlyFire friendlyFire) {
        this.friendlyFire = friendlyFire;
    }

    public int getRoundsInSpawn() {
        return roundsInSpawn;
    }

    public void setRoundsInSpawn(int roundsInSpawn) {
        this.roundsInSpawn = roundsInSpawn;
    }

    @Override
    public String toString() {
        return "Behavior{" +
                "afkRounds=" + afkRounds +
                ", friendlyFire=" + friendlyFire +
                ", roundsInSpawn=" + roundsInSpawn +
                '}';
    }
}