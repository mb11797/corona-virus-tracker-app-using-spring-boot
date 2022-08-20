package com.tom.coronavirustrackerapp.models;

public class LocationStats {
    
    private String state;
    private String country;
    private Integer latestTotalCases;
    private Integer diffFromPrevDay;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public Integer getLatestTotalCases() {
        return latestTotalCases;
    }
    
    public void setLatestTotalCases(Integer latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }
    
    public Integer getDiffFromPrevDay() {
        return diffFromPrevDay;
    }
    
    public void setDiffFromPrevDay(Integer diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }

    @Override
    public String toString() {
        return "LocationStats [country=" + country + ", diffFromPrevDay=" + diffFromPrevDay + ", latestTotalCases="
                + latestTotalCases + ", state=" + state + "]";
    }

    
}
