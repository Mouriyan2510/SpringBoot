package com.soft.StudentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.StudentDetails.Repository.StudentRepo;
import com.soft.StudentDetails.entity.Student;
import com.soft.StudentDetails.exception.AgeNotAllowedException;
@Repository
public class StudentDao {
	
	
	@Autowired
	StudentRepo stuRepo;

	public String insertonedata(Student s){
		 stuRepo.save(s);
		 return "Inserted one object successfully";
	}
	
	
	public String insertalldata(@RequestBody List<Student> s) {
		stuRepo.saveAll(s);
		return "Inserted all data Successfully";
	}


	public Student getById(int a) {
		return stuRepo.findById(a).get();
	}
	
	public List<Student> getall() {
		return stuRepo.findAll();
	}
	
	public String update(@RequestBody Student s) throws AgeNotAllowedException {
		stuRepo.save(s);
		return "Update Successfully";
	}


	public String deleteById(int a) {
		stuRepo.deleteById(a);
		return "Deleted one data Successfully";
	}
	
	public List<Integer> getattenById() {
		return stuRepo.getattenById();
	}
	



}
