package com.bytejoke.remote.models;

public class Sensor {
    private int id;
    private String name;


    public Sensor(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Sensor() {}

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
}
