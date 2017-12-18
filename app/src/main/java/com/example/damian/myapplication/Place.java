package com.example.damian.myapplication;

/**
 * Created by Damian on 18.12.2017.
 */

public class Place {

private int temperature;
private String placeName;
private String information;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

Place(int Temperature, String placeName, String information)
{
    this.temperature = Temperature;
    this.placeName = placeName;
    this.information = information;

}
}
