package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weapon {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("assets")
    private WeaponAssets assets;

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

    public WeaponAssets getAssets() {
        return assets;
    }

    public void setAssets(WeaponAssets assets) {
        this.assets = assets;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", assets=" + assets +
                '}';
    }
}
