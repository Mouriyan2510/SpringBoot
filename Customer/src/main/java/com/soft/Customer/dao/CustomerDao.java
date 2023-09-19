package com.soft.Customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.Customer.entity.CustomerEntity;
import com.soft.Customer.repository.CustomerRepo;
@Repository
public class CustomerDao {

	
	@Autowired
	CustomerRepo custRepo;
	public String insertalldata(List<CustomerEntity> ce) {
		custRepo.saveAll(ce);
		return "Inserted all data Successfullty";
	}
	
	
	public CustomerEntity getoneiddetail(int a) {
		return custRepo.findById(a).get();
	}
	
	
	public List<CustomerEntity> getalliddetail() {
		return custRepo.findAll();
	}
	


	public String insertifsc(List<CustomerEntity> resultsDetails) {
		 custRepo.saveAll(resultsDetails);
		 return "Inserted done";
	}

}
