package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Assistant {
    @JsonProperty("assistant_puuid")
    private String assistantPuuid;
    @JsonProperty("assistant_display_name")
    private String assistantRiotID;
    @JsonProperty("assistant_team")
    private String assistantTeam;

    public String getAssistantPuuid() {
        return assistantPuuid;
    }

    public void setAssistantPuuid(String assistantPuuid) {
        this.assistantPuuid = assistantPuuid;
    }

    public String getAssistantRiotID() {
        return assistantRiotID;
    }

    public void setAssistantRiotID(String assistantRiotID) {
        this.assistantRiotID = assistantRiotID;
    }

    public String getAssistantTeam() {
        return assistantTeam;
    }

    public void setAssistantTeam(String assistantTeam) {
        this.assistantTeam = assistantTeam;
    }

    @Override
    public String toString() {
        return "Assistant{" +
                "assistantPuuid='" + assistantPuuid + '\'' +
                ", assistantRiotID='" + assistantRiotID + '\'' +
                ", assistantTeam='" + assistantTeam + '\'' +
                '}';
    }
}
