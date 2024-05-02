package com.dockerize.App.docker.service;

import com.dockerize.App.docker.entity.Shipper;
import com.dockerize.App.docker.repositories.ShipperRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperService {

    @Autowired
    ShipperRepo sr;

    public List<Shipper> getAllShippers() {
        return sr.findAll();
    }
}
