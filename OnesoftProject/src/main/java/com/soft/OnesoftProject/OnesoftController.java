package com.soft.OnesoftProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnesoftController {
	
	@GetMapping("getstudents")
	public String getstudents() {
		return "This is student";
	}
	
	@GetMapping("gettrainers")
	public String gettrainers() {
		return "This is Trainers";
	}
	
	@GetMapping("getManagers")
	public String getManagers() {
		return "This is Managers";
	}
	
	

}
