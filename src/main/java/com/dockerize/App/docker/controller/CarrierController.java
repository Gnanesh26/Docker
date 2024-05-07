package com.dockerize.App.docker.controller;

import com.dockerize.App.docker.entity.Carrier;
import com.dockerize.App.docker.repositories.CarrierRepo;
import com.dockerize.App.docker.service.carrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarrierController {

    @Autowired
    private carrierService cs;

    @Autowired
    private CarrierRepo carrierRepo;

    @GetMapping("/carriers")
    public List<Carrier> getAllCarriers() {
        return cs.getAllCarriers();
    }
}
