package com.soft.EmpScopeOfBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	
	public Employee() {
		System.out.println("Bean is Created");
	}
	
	@Value("Mouri")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	
	

}
