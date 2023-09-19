 package com.soft.ProductDetails;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("Senior")
public class SeniorStudent implements Student{
	public String getMsg() {
		return "Hi This is senior student";
	}
	

}
