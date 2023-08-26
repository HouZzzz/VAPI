package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FriendlyFire {
    @JsonProperty("incoming")
    private int incoming;
    @JsonProperty("outgoing")
    private int outgoing;

    public int getIncoming() {
        return incoming;
    }

    public void setIncoming(int incoming) {
        this.incoming = incoming;
    }

    public int getOutgoing() {
        return outgoing;
    }

    public void setOutgoing(int outgoing) {
        this.outgoing = outgoing;
    }

    @Override
    public String toString() {
        return "FriendlyFire{" +
                "incoming=" + incoming +
                ", outgoing=" + outgoing +
                '}';
    }
}
