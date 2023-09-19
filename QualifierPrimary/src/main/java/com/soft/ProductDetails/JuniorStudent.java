package com.soft.ProductDetails;

import org.springframework.stereotype.Service;

@Service("junior")
public class JuniorStudent implements Student{
	public String getMsg() {
		return "Hi This is Junior student";
	}

}
