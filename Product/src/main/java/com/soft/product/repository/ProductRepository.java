package com.soft.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	@Query(value="SELECT * FROM product_details where hsn=?",nativeQuery=true)
	public ProductEntity getbyhsn(int a);
	
	@Query(value="SELECT price FROM product_details where hsn=?",nativeQuery=true)
	public int getpricebyhsn(int a);
	
	@Query(value="select price from product_details",nativeQuery = true)
	public List<Integer> getallprice();
}
