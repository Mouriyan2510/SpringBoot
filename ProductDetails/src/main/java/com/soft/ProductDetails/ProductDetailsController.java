package com.soft.ProductDetails;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductDetailsController {
	
	
//	RestTemplate rest=new RestTemplate();
//	@GetMapping("getDetailsfromProduct")
//	public String getDetailsfromProduct() {
//		String url="http://localhost:8081/getMobile";
//		ResponseEntity <String> response=rest.exchange(url,HttpMethod.GET,null,String.class);
//		String value=response.getBody();
//		return value;
//	}
	
	
	@GetMapping("getMobileDetails")
	public String getMobileDetails() {
		return "Oneplus---Nord---12gb---256 ";
	}   

}
