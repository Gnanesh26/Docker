package com.dockerize.App.docker.service;

import com.dockerize.App.docker.entity.Carrier;
import com.dockerize.App.docker.repositories.CarrierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class carrierService {

    @Autowired
    private CarrierRepo carrierRepo;

    public List<Carrier> getAllCarriers() {
        return carrierRepo.findAll();
    }
}
