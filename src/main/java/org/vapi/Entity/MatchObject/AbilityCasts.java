package org.vapi.Entity.MatchObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilityCasts {
    @JsonProperty("c_cast")
    private int c;
    @JsonProperty("q_cast")
    private int q;
    @JsonProperty("e_cast")
    private int e;
    @JsonProperty("x_cast")
    private int x;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "AbilityCasts{" +
                "c=" + c +
                ", q=" + q +
                ", e=" + e +
                ", x=" + x +
                '}';
    }
}
