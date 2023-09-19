package com.soft.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("Get")
public class HelloController {
	
	
	@Autowired
	RestTemplate rt;
//	RestTemplate rt=new RestTemplate();
//	
	@GetMapping("gethiviahello")
	public String gethiviahello() {
		String url="http://localhost:8080/Msg/gethi";
//		ResponseEntity<String>response=rt.exchange(url,HttpMethod.GET,null,String.class);
//		String value=response.getBody();
		String value=rt.getForObject(url,String.class);
		return value;
	}
	
	@GetMapping("gettesthello")
	public int gettesthello() {
		String url="http://localhost:8080/Msg/test";
		ResponseEntity<Integer>response=rt.exchange(url,HttpMethod.GET,null,Integer.class);
		Integer value=response.getBody();
		return value;
	}

}
