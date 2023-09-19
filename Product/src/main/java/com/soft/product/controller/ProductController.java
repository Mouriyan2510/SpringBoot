package com.soft.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.product.entity.ProductEntity;
import com.soft.product.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	ProductService proser;
	
	@PostMapping("insertall")
	public String insertAll(@RequestBody List<ProductEntity> p) {
		return proser.insertAll(p);
	}
	
	@GetMapping("getoneid/{a}")
	public ProductEntity getoneid(@PathVariable int a) {
		return proser.getoneid(a);
	}
	@GetMapping("getoneidall")
	public List<ProductEntity> getoneidall() {
		return proser.getoneidall();
	}
	
	@GetMapping("getbyhsn/{a}")
	public ProductEntity getbyhsn(@PathVariable int a) {
		return proser.getbyhsn(a);
	}
	
	@GetMapping("getpricebyhsn/{a}")
	public Integer getpricebyhsn(@PathVariable int a) {
		return proser.getpricebyhsn(a);
	}
	
	@GetMapping("getallprice")
	public List<Integer> getallprice() {
		return proser.getallprice();
	}
	

}
