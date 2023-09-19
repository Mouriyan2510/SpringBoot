package com.soft.StudentDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.StudentDetails.dao.StudentDao;
import com.soft.StudentDetails.entity.Student;
import com.soft.StudentDetails.exception.AgeNotAllowedException;

@Service
public class StudentService {

	@Autowired
	StudentDao studao;

	public String insertonedata(Student s) throws AgeNotAllowedException {
		try {
			if (s.getAge() < 18) {
				throw new AgeNotAllowedException("You are not allowed for this process");
			} else {
				return studao.insertonedata(s);
			}
		} catch (AgeNotAllowedException ae) {
			return "Run all Except this exception";
		}
	}

	public String insertalldata(@RequestBody List<Student> s) {
		return studao.insertalldata(s);
	}

	public Student getById(int a) {
		return studao.getById(a);
	}

	public List<Student> getall() {
		return studao.getall();
	}
	
	
	public String update(@RequestBody Student s) throws AgeNotAllowedException {
		if (s.getAge() < 18) {
			throw new AgeNotAllowedException("You are not allowed for this process");
		} else {
			return studao.update(s);
		}
	}

	public String deleteById(int a) {
		return studao.deleteById(a);
	}
	
	public List<Integer> getattenById() {
		return studao.getattenById();
	}
	
		
	}


