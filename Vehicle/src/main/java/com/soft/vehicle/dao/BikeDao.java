package com.soft.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.vehicle.entity.Bike;
import com.soft.vehicle.repository.BikeRepository;
@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikeRepo;
	public String addBike(List<Bike> c) {
		bikeRepo.saveAll(c);
		return "Succesfully Inserted";
	}
	
	public Bike getValue(@PathVariable int a) {
		return bikeRepo.findById(a).get();
	}
	
	public List<Bike> getValueAll() {
		return bikeRepo.findAll();
	}
	
	public String updateBike(@RequestBody Bike c) {
		 bikeRepo.save(c);
		 return "Updated Succesfully";		 
	}

	public String delete(@PathVariable int a) {
		 bikeRepo.deleteById(a);
		 return "Deleted Successfully";
	}
}
