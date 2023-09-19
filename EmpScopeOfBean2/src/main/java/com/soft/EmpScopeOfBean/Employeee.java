 package com.soft.EmpScopeOfBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("prototype")
@Component
public class Employeee {
	
	private String name;
	
	public  Employeee() {
		System.out.println("Bean is created");
	}

	public String getName() {
		return name;
	}

	@Value("Mouri")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	
	
	

}
