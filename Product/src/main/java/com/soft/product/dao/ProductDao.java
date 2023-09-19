package com.soft.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.product.entity.ProductEntity;
import com.soft.product.repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository proRepo;
	
	public String insertAll(List<ProductEntity> p) {
		 proRepo.saveAll(p);
		 return "Successfully Inserted";
	}

	public ProductEntity getoneid(int a) {
		return proRepo.findById(a).get();
	}
	
	public List<ProductEntity> getoneidall() {
		return proRepo.findAll();
	}

	public ProductEntity getbyhsn(int a) {
		return proRepo.getbyhsn(a);
	}
	
	public Integer getpricebyhsn(@PathVariable int a) {
		return proRepo.getpricebyhsn(a);
	}
	
	public List<Integer> getallprice() {
		return proRepo.getallprice();
	}

}
