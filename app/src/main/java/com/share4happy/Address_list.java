package com.share4happy;

import java.io.Serializable;

public class Address_list implements Serializable {
    private String name;
    private String title;
    private Double latitude;
    private Double longtitude;

    public Address_list(){

    }

    public Address_list(String name, String title, Double latitude, Double longtitude) {
        this.name = name;
        this.title = title;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }
}
