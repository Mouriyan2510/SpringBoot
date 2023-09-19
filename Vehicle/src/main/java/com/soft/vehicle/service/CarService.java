package com.soft.vehicle.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.vehicle.dao.CarDao;
import com.soft.vehicle.entity.Car;
import com.soft.vehicle.exceptionThrower.IdNotFoundException;
import com.soft.vehicle.exceptionThrower.ModelNotAllowedException;
import com.soft.vehicle.exceptionThrower.ModelNotFoundException;
@Service
public class CarService {

	@Autowired
	CarDao cardao;
	public String addCar(List<Car> c) {
			return cardao.addCar(c);
		}
	
	public Car getid(@PathVariable int a){
		
		return cardao.getid(a);
		
	}
		
	
	public String updatee(@RequestBody Car a)throws ModelNotAllowedException {
		if(a.getModel()<2000) {
			throw new ModelNotAllowedException("You are not eligible ");
		}
		else {
			return cardao.updatee(a);
		}
	}
	
	public List<Car> getidall() {
		return cardao.getidall();
	}
	
	public String delete(@PathVariable int a) {
		return cardao.delete(a);
	}
	
	public List<Car> getbyModel(@PathVariable String a)throws ModelNotFoundException {
		if(cardao.getbyModel(a).isEmpty()) {
			throw new ModelNotFoundException("There is no model like that");
		}
		else {
		return cardao.getbyModel(a);
		}
	}
	
	public Car getMaxPrice() {
		List<Car> maxCar= cardao.getidall();
		return maxCar.stream().max(Comparator.comparing(Car::getPrice)).get();
	} 
	
	public Car getMinPrice() {
		List<Car> minCar= cardao.getidall();
		return minCar.stream().min(Comparator.comparing(Car::getPrice)).get();
	} 
	
	public Car getSecondMaxPrice() {
		List<Car> secondMinCar= cardao.getidall();
		return secondMinCar.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).skip(1).findFirst().get();
	} 
	
	public List<Integer> getModelYear() {
		List<Car> model= cardao.getidall();
		return model.stream().filter(u-> u.getModel()>2008).map(t-> t.getModel()).collect(Collectors.toList());
	}
	
	public Car getMinYear() {
		List<Car> minYear= cardao.getidall();
		return minYear.stream().min(Comparator.comparing(Car::getModel)).get();
	}
}


