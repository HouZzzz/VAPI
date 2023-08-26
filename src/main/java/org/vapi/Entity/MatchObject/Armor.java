package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Armor {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;

    @JsonProperty("assets")
    private WeaponAssets weaponAssets;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeaponAssets getWeaponAssets() {
        return weaponAssets;
    }

    public void setWeaponAssets(WeaponAssets weaponAssets) {
        this.weaponAssets = weaponAssets;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weaponAssets=" + weaponAssets +
                '}';
    }
}
