package com.dockerize.App.docker.repositories;

import com.dockerize.App.docker.entity.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipperRepo extends JpaRepository<Shipper,Integer> {}
