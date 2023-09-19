package com.soft.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.vehicle.entity.Car;
import com.soft.vehicle.repository.CarRepository;
@Repository
public class CarDao {
	@Autowired
	CarRepository carRepo;
	public String addCar(List <Car> c) {
		 carRepo.saveAll(c);
		 return "Successfully Added";
	}
	public Car getid(int a) {
		
		return carRepo.findById(a).get();
	}
	
	public String updatee(@RequestBody Car a) {
		 carRepo.save(a);
		 return "Successfully Updated";
	}
	
	public List<Car> getidall() {
		return carRepo.findAll();
	}
	
	public List<Car> getbyModel(@PathVariable String a) {
		return carRepo.getByModel(a);
	}

	public String delete(@PathVariable int a) {
		 carRepo.deleteById(a);
		 return "Deleted Succesfully";
	}
	
	
}
