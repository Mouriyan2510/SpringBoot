package com.soft.FlipKart;

import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootTest
class FlipkartApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	OrderController oc;
	
	@org.junit.Test
	public void ObjectData(OrderEntity oe) {
		assertSame("Posted Successfully", oc.postoneObjectData(oe));
	}
	
}
