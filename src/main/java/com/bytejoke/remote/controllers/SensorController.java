package com.bytejoke.remote.controllers;

import com.bytejoke.remote.dao.SensorDAO;
import com.bytejoke.remote.models.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sensors")
public class SensorController {
    private final SensorDAO sensorDAO;

    @Autowired
    public SensorController(SensorDAO sensorDAO) {
        this.sensorDAO = sensorDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("sensors", sensorDAO.index());
        return "sensors/index";
    }

    @GetMapping("/new")
    public String newSensorView(@ModelAttribute("sensor") Sensor sensor) {
        return "sensors/new";
    }

    @PostMapping()
    public String addSensor(@ModelAttribute("sensor") Sensor sensor) {
        sensorDAO.add(sensor);
        return "redirect:/sensors";
    }

    @GetMapping("/{id}/edit")
    public String editSensorView(Model model, @PathVariable("id") int id) {
        model.addAttribute("sensor", sensorDAO.show(id));
        return "sensors/edit";
    }
    



}
