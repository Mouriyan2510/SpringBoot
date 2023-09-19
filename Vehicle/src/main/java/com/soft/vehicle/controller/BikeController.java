package com.soft.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.vehicle.entity.Bike;
import com.soft.vehicle.service.BikeService;

@RestController
@RequestMapping(value = "/bike")
public class BikeController {
	@Autowired
	BikeService bikesev;

	@PostMapping(value = "/post")
	public String addBike(@RequestBody List<Bike> c) {
		return bikesev.addBike(c);
	}
	
	@GetMapping("get/{a}")
	public Bike getValue(@PathVariable int a) {
		return bikesev.getValue(a);
	}
	
	@GetMapping("getAll")
	public List<Bike> getValueAll() {
		return bikesev.getValueAll();
	}
	
	@PostMapping(value = "/update/{c}")
	public String updateBike(@RequestBody Bike c) {
		return bikesev.updateBike(c);
	}
	
	@DeleteMapping("/deleteBy/{a}")
	public String delete(@PathVariable int a) {
		return bikesev.delete(a); 
	}
	
	
	
	

}
