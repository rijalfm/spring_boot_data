package com.api.controllers;

import com.api.models.entities.Pendonor;
import com.api.services.PendonorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/pendonor")
public class PendonorController {

    @Autowired
    private PendonorService pendonorService;

    @GetMapping
    public Iterable<Pendonor> showAll() {
        return pendonorService.findAll();
    }

    @GetMapping("/{id}")
    public Pendonor findOne(@PathVariable("id") Integer id) {
        return pendonorService.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteData(@PathVariable("id") Integer id) {
        pendonorService.deleteOne(id);
    }

    @PostMapping
    public Pendonor createData(@RequestBody Pendonor pendonor) {
        return pendonorService.save(pendonor);
    }

    @PutMapping
    public Pendonor updateData(@RequestBody Pendonor pendonor) {
        return pendonorService.save(pendonor);
    }
}
