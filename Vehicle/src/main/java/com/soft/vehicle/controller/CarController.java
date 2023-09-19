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

import com.soft.vehicle.entity.Car;
import com.soft.vehicle.exceptionThrower.IdNotFoundException;
import com.soft.vehicle.exceptionThrower.ModelNotAllowedException;
import com.soft.vehicle.exceptionThrower.ModelNotFoundException;
import com.soft.vehicle.service.CarService;

@RestController
@RequestMapping(value = "/car")
public class CarController {
	@Autowired
	CarService carsev;

	@PostMapping(value = "/post")
	public String addCar(@RequestBody List<Car> c) {
		return carsev.addCar(c);
	}
	
	@GetMapping("/getId/{a}")
	public Car getid(@PathVariable int a)throws IdNotFoundException {
		return carsev.getid(a);
	}
	
	@PostMapping(value = "/update/{z}")
	public String updatee(@RequestBody Car a)throws ModelNotAllowedException {
		return carsev.updatee(a);
	}
	
	@GetMapping("/getIdAll")
	public List<Car> getidall() {
		return carsev.getidall();
	}
	
	@GetMapping("/getbyModel/{a}")
	public List<Car> getbyModel(@PathVariable String a)throws ModelNotFoundException {
		return carsev.getbyModel(a);
	}
	
	@DeleteMapping("/deleteBy/{a}")
	public String delete(@PathVariable int a) {
		return carsev.delete(a);
	}
	
	
	@GetMapping("/getMaxPrice")
	public Car getMaxPrice() {
		return carsev.getMaxPrice();
	}
	
	@GetMapping("/getMinPrice")
	public Car getMinPrice() {
		return carsev.getMinPrice();
	}
	
	@GetMapping("/getSecondMaxPrice")
	public Car getSecondMaxPrice() {
		return carsev.getSecondMaxPrice();
	}
	
	@GetMapping("/getModelYear")
	public List<Integer> getModelYear() {
		return carsev.getModelYear();
	}
	
	@GetMapping("/getMinYear")
	public Car getMinYear() {
		return carsev.getMinYear();
	}
	
	
	
}
