package com.mpp.javaproject.swimmasterjfx.domain;

public class Competition extends Entity<Integer>{
    private int distance;
    private CompetitionStyle style;

    public Competition(int distance, CompetitionStyle style) {
        this.distance = distance;
        this.style = style;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public CompetitionStyle getStyle() {
        return style;
    }

    public void setStyle(CompetitionStyle style) {
        this.style = style;
    }
}
