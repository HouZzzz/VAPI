package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadoutValue {
    @JsonProperty("overall")
    private int overall;
    @JsonProperty("average")
    private int average;

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Spent{" +
                "overall=" + overall +
                ", average=" + average +
                '}';
    }
}
