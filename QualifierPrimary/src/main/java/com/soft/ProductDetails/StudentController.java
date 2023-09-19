package com.soft.ProductDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	@Qualifier("junior") 
	Student std;
	
	@GetMapping("getStd")
	public String getMsg() {
		return std.getMsg();
	}

}
