package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoundEconomy {
    @JsonProperty("loadout_value")
    private int loadoutValue;
    @JsonProperty("weapon")
    private Weapon weapon;
    @JsonProperty("armor")
    private Armor armor;
    @JsonProperty("remaining")
    private int remaining;
    @JsonProperty("spent")
    private int spent;

    public int getLoadoutValue() {
        return loadoutValue;
    }

    public void setLoadoutValue(int loadoutValue) {
        this.loadoutValue = loadoutValue;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public int getSpent() {
        return spent;
    }

    public void setSpent(int spent) {
        this.spent = spent;
    }

    @Override
    public String toString() {
        return "RoundEconomy{" +
                "loadoutValue=" + loadoutValue +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", remaining=" + remaining +
                ", spent=" + spent +
                '}';
    }
}
