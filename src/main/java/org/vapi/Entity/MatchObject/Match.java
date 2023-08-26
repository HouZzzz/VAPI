package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("players")
    private Players players;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Match{" +
                "metadata=" + metadata +
                ", players=" + players +
                '}';
    }
}
