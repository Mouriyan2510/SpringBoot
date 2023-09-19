package com.soft.AtAnnotation;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Value("${vv}")
	private String a;
	
	@GetMapping("/getThis")
	public String getThis() {
		return "Current environment "+ a;
	}
	
	

}
