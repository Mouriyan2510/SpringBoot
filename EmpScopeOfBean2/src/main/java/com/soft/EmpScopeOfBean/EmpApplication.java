package com.soft.EmpScopeOfBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmpApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmpApplication.class, args);
	}
	
	
	@Autowired
	ApplicationContext con;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
	
	Employeee e1=con.getBean(Employeee.class);
	e1.setName("Raju");
	System.out.println(e1);
	Employeee e2=con.getBean(Employeee.class);
	e2.setName("Naveen");
	System.out.println(e2);
	Employeee e3=con.getBean(Employeee.class);
	System.out.println(e3);
	}

}
