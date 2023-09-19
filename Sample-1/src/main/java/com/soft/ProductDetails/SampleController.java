package com.soft.ProductDetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;


//@Controller
////@ResponseBody

@RestController
public class SampleController {
	
	@GetMapping("get")
	public String gett() {
		return "hello.html";
	}
	
	@GetMapping("getmsg")
	public String getMsg(@PathParam("username") String username,@PathParam("password") String password ) {
	if(username.equals("username")&&password.equals("password")) {
		return "Mouri";
	}
	else {
		return "Vinoth";
	}
	 
	}
	
	
	
	
	
	
	
	
}
	
//	@GetMapping("getty")
//	public ResponseEntity<String> get(){
//		return new ResponseEntity<String>("Hello World",HttpStatus.OK);
//	}
	

