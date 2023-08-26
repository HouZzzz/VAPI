package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.vapi.Entity.AccountObject.Card;

public class Assets {
    @JsonProperty("card")
    private Card card;
    @JsonProperty("agent")
    private AgentImages agentImages;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public AgentImages getAgentImages() {
        return agentImages;
    }

    public void setAgentImages(AgentImages agentImages) {
        this.agentImages = agentImages;
    }
}
