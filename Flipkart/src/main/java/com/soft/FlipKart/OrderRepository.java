package com.soft.FlipKart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{
	
	@Query(value="SELECT * FROM order_table a join prod_table b on a.order_id=b.order_fk",nativeQuery = true)
	public List<Object> getAll();

}
