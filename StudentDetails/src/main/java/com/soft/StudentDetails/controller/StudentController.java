package com.soft.StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.StudentDetails.entity.Student;
import com.soft.StudentDetails.exception.AgeNotAllowedException;
import com.soft.StudentDetails.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService stuser;

	@PostMapping("insertdata")
	public String insertonedata(@RequestBody Student s) throws AgeNotAllowedException {
		return stuser.insertonedata(s);
	}

	@PostMapping("insertalldata")
	public String insertalldata(@RequestBody List<Student> s) {
		return stuser.insertalldata(s);
	}

	@GetMapping("getById/{a}")
	public Student getById(@PathVariable int a) {
		return stuser.getById(a);
	}

	@GetMapping("getall")
	public List<Student> getall() {
		return stuser.getall();
	}
	
	@PutMapping("insertdata/{s}")
	public String update(@RequestBody Student s) throws AgeNotAllowedException {
		return stuser.update(s);
	}
	
	@DeleteMapping("deleteById/{a}")
	public String deleteById(@PathVariable int a) {
		return stuser.deleteById(a);
	}
	
	@GetMapping("getattenById")
	public List<Integer> getattenById() {
		return stuser.getattenById();
	}
	

}
