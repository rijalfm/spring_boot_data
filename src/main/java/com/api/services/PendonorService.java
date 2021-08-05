package com.api.services;

import javax.transaction.Transactional;

import com.api.models.entities.Pendonor;
import com.api.models.repositories.PendonorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PendonorService {

    @Autowired
    public PendonorRepository pendonorRepository;

    public Pendonor save(Pendonor pendonor) {
        return pendonorRepository.save(pendonor);
    }

    public Pendonor findOne(Integer id) {
        return pendonorRepository.findById(id).get();
    }

    public Iterable<Pendonor> findAll() {
        return pendonorRepository.findAll();
    }

    public void deleteOne(Integer id) {
        pendonorRepository.deleteById(id);
        ;
    }

}
