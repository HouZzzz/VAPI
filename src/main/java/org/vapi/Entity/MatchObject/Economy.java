package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Economy {
    @JsonProperty("spent")
    private Spent spent;
    @JsonProperty("loadout_value")
    private LoadoutValue loadoutValue;

    public Spent getSpent() {
        return spent;
    }

    public void setSpent(Spent spent) {
        this.spent = spent;
    }

    public LoadoutValue getLoadoutValue() {
        return loadoutValue;
    }

    public void setLoadoutValue(LoadoutValue loadoutValue) {
        this.loadoutValue = loadoutValue;
    }

    @Override
    public String toString() {
        return "Economy{" +
                "spent=" + spent +
                ", loadoutValue=" + loadoutValue +
                '}';
    }
}
