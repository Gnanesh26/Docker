package com.dockerize.App.docker.repositories;

import com.dockerize.App.docker.entity.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrierRepo extends JpaRepository<Carrier,Integer> {}
