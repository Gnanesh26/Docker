package com.dockerize.App.docker.controller;

import com.dockerize.App.docker.entity.Shipper;
import com.dockerize.App.docker.service.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShipperController {

    @Autowired
    private ShipperService shipperService;

    @GetMapping("/shippers")
    public List<Shipper> getAllShippers() {
        return shipperService.getAllShippers();
    }
}
