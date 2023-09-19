package com.soft.Products;

import java.util.List;import org.apache.hc.core5.http.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ProductController {
	
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("getDetails")
	public ResponseEntity<String> getDetails() {
//		String url="http://localhost:8082/getMobileDetails";
		String url="http://ProductDetailsApi/getMobileDetails";
		
		ResponseEntity <String> response=rest.exchange(url,HttpMethod.GET,null,String.class);
		String value=response.getBody();
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(value);
//		return ResponseEntity.ok(value);
	}
	
	@GetMapping("getMobile")
	public String getMobile() {
		return "Oneplus";
	}
	
	

}
