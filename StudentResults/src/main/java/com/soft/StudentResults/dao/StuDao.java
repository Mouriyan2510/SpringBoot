package com.soft.StudentResults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soft.StudentResults.Repository.StuRepo;
import com.soft.StudentResults.entity.Results;
@Repository
public class StuDao {

	@Autowired
	StuRepo sturepo;
	
	
	public String InsertToDb(Results r) {
		 sturepo.save(r);
		 return "Inserted Successfully";
	}


	public List<Results> InsertToDbsingle(Results r) {
		return sturepo.InsertToDbsingle(r);
		 
	}


	public String updateByRoll(Results a, int roll) {
		sturepo.save(a);
		return "Updated Successfully";
	}


	public String add5markpost(List<Results> result) {
		sturepo.saveAll(result);
		return "MarkAdded Successfully";
	}


	public List<Results> getallmarks() {
		return sturepo.findAll();
	}




}
