package com.soft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	
	@Autowired
	OrderRepository ordRepo;

	public String postoneObjectData(OrderEntity oe) {
		ordRepo.save(oe);
		return "Posted Successfully";
	}

	public String delete(int a) {
		ordRepo.deleteById(a);
		return "Deleted Successfully";
	}

	public List<Object> getAll() {
		return ordRepo.getAll();
	}
	

}
