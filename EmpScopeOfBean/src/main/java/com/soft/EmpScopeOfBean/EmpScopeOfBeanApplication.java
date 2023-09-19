package com.soft.EmpScopeOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpScopeOfBeanApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmpScopeOfBeanApplication.class, args);
	}

	@Autowired
	ApplicationContext con;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hello");
		Employee e1=con.getBean(Employee.class);
		Employee e2=con.getBean(Employee.class);
		Employee e3=con.getBean(Employee.class);
		
	}
	
		
	}
	