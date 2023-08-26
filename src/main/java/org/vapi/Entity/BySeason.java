package org.vapi.Entity;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class BySeason {
    private Map<String, Act> acts = new HashMap<>();

    @JsonAnySetter
    public void setAct(String name, Object value) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String s = objectMapper.writeValueAsString(value);
            Act act = objectMapper.readValue(s, Act.class);
            acts.put(name,act);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<String, Act> getActs() {
        return acts;
    }

    @Override
    public String toString() {
        return "BySeason{" +
                "acts=" + acts +
                '}';
    }
}
