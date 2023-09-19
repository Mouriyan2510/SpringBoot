package com.soft.Customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.Customer.dao.CustomerDao;
import com.soft.Customer.entity.CustomerEntity;
@Service
public class CustomerService {

	@Autowired
	CustomerDao custdao;
	
	public String insertalldata(List<CustomerEntity> ce) {
		return custdao.insertalldata(ce);
	}

	public CustomerEntity getoneiddetail(int a) {
		return custdao.getoneiddetail(a);
	}

	public List<CustomerEntity> getalliddetail() {
		return custdao.getalliddetail();
	}

	public String insertifsc(List<CustomerEntity> resultsDetails) {
		return custdao.insertifsc(resultsDetails);
	}
	
	


}
