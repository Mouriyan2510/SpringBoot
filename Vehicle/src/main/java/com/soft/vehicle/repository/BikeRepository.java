package com.soft.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

}
