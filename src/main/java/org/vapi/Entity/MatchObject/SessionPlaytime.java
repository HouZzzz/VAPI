package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionPlaytime {
    @JsonProperty("minutes")
    private int minutes;
    @JsonIgnoreProperties("seconds")
    private int seconds;

    @JsonProperty("milliseconds")
    private long milliseconds;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public long getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(long milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Override
    public String toString() {
        return "SessionPlaytime{" +
                "minutes=" + minutes +
                ", seconds=" + seconds +
                ", milliseconds=" + milliseconds +
                '}';
    }
}
