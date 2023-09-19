package com.soft.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.product.dao.ProductDao;
import com.soft.product.entity.ProductEntity;
@Service
public class ProductService {
	@Autowired
	ProductDao prodao;
	
	
	public String insertAll(List<ProductEntity> p) {
		return prodao.insertAll(p);
	}


	public ProductEntity getoneid(int a) {
		return prodao.getoneid(a);
	}
	
	public List<ProductEntity> getoneidall() {
		return prodao.getoneidall();
	}


	public ProductEntity getbyhsn(int a) {
		return prodao.getbyhsn(a);
	}
	
	public Integer getpricebyhsn(@PathVariable int a) {
		return prodao.getpricebyhsn(a);
	}


	public List<Integer> getallprice() {
		return prodao.getallprice();
	}

}
