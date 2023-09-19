package com.soft.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.vehicle.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
	@Query(value="select * from car_details where brand like %?%",nativeQuery=true)
	public List<Car> getByModel(String brand);
	
	@Query(value="select * from car_details where id!=?",nativeQuery = true)
	public Car getId(int id);
}

