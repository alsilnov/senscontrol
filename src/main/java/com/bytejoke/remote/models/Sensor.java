package com.bytejoke.remote.models;

public class Sensor {
    private int id;
    private String name;
    private int temperature;
    private int humidity;

    public Sensor(int id, String name, int temperature, int humidity) {
        this.id = id;
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Sensor() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

}