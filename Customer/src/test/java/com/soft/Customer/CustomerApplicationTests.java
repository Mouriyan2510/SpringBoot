package com.soft.Customer;

import static org.junit.Assert.assertSame;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.Customer.controller.CustomerController;
import com.soft.Customer.entity.CustomerEntity;

@SpringBootTest
class CustomerApplicationTests {

	@Autowired
	CustomerController cc;
	
	@org.junit.Test
	void contextLoads() {
	}
	
	@org.junit.Test
	public void testinsertalldata(List<CustomerEntity> ce) {
		assertSame("Inserted all data Successfullty", cc.insertalldata(ce));
	}

}
