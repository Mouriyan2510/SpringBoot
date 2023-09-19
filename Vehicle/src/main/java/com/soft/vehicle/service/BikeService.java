package com.soft.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.vehicle.dao.BikeDao;
import com.soft.vehicle.entity.Bike;
@Service
public class BikeService {
	@Autowired
	BikeDao bikedao;
	public String addBike(List<Bike> c) {
		return bikedao.addBike(c);
	}
	
	public Bike getValue(@PathVariable int a) {
		return bikedao.getValue(a);
	}
	
	public List<Bike> getValueAll() {
		return bikedao.getValueAll();
	}
	
	public String updateBike(@RequestBody Bike c) {
		return bikedao.updateBike(c);
	}
	
	public String delete(@PathVariable int a) {
		return bikedao.delete(a);
	}

}
