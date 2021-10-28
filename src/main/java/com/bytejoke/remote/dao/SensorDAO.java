package com.bytejoke.remote.dao;

import java.util.ArrayList;
import java.util.List;

import com.bytejoke.remote.models.Sensor;

import org.springframework.stereotype.Component;

@Component
public class SensorDAO {
    private static int sensorCount;
    private List<Sensor> sensorsList;

    public SensorDAO() {
        this.sensorsList = new ArrayList<>();
        sensorsList.add(new Sensor(++sensorCount, "First"));
        sensorsList.add(new Sensor(++sensorCount, "Second"));
        sensorsList.add(new Sensor(++sensorCount, "Third"));
        sensorsList.add(new Sensor(++sensorCount, "Fourth"));
        sensorsList.add(new Sensor(++sensorCount, "Fifth"));
        sensorsList.add(new Sensor(++sensorCount, "Sixth"));
    }

    public List<Sensor> index() {
        return sensorsList;
    }

    public Sensor show(int id) {
        return sensorsList.stream().filter(sensor -> sensor.getId() == id).findAny().orElse(null);
    }

    public void add(Sensor sensor) {
        sensor.setId(++sensorCount);
        sensorsList.add(sensor);
    }
}
