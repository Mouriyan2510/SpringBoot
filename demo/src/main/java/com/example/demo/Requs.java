package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class Requs {
	
	@GetMapping("/credentials")
	public String credential(@RequestParam  String UserName,@RequestParam  String Password) {
		if(UserName.equals("Mouriyan")&&Password.equals("Welcome@123")) {
			return "Access Granted";
		}
		else {
			return "Access Denied";//by calling this in url
		}//http://localhost:8080/admin/credentials?UserName=Mouriyan&Password=Welcome@123
	}
}

