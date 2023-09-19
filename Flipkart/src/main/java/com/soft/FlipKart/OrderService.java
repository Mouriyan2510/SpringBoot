package com.soft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class OrderService {
	
	@Autowired
	OrderDao ordDao;

	public String postoneObjectData(OrderEntity oe) {
		return ordDao.postoneObjectData(oe);
	}

	
	public String delete(@PathVariable int a) {
		return ordDao.delete(a);
	}


	public List<Object> getAll() {
		return ordDao.getAll();
	}
}
