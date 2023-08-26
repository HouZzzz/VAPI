package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JsonProperty("metadata")
    private Metadata metadata;

    @JsonProperty("players")
    private Players players;

    @JsonProperty("teams")
    private Teams teams;

    @JsonProperty("rounds")
    private List<Round> rounds;

    @JsonProperty("kills")
    private List<KillEvent> kills;

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

    public Teams getTeams() {
        return teams;
    }

    public void setTeams(Teams teams) {
        this.teams = teams;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public List<KillEvent> getKills() {
        return kills;
    }

    public void setKills(List<KillEvent> kills) {
        this.kills = kills;
    }

    @Override
    public String toString() {
        return "Match{" +
                "metadata=" + metadata +
                ", players=" + players +
                ", teams=" + teams +
                ", rounds=" + rounds +
                ", kills=" + kills +
                '}';
    }
}
