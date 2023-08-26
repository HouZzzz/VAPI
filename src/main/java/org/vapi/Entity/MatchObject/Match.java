package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JsonProperty("metadata")
    private Metadata metadata;
}
