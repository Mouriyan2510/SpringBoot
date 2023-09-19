package com.soft.StudentMarkSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.StudentMarkSheet.Repository.MarkSheetRepository;
import com.soft.StudentMarkSheet.entity.MarkSheet;
@Repository
public class MarkSheetDao {

	
	@Autowired
	MarkSheetRepository markRepo;
	
	
	public String insertall(MarkSheet ms) {
		markRepo.save(ms);
		return "Data Inserted Successfully";
	}
	
	
	public List<MarkSheet> getAll() {
		return markRepo.findAll();
	}
	
	public MarkSheet getById(@PathVariable int a) {
		return markRepo.findById(a).get();
	}
	
	public String updateById(@RequestBody MarkSheet a) {
		markRepo.save(a);
		return "Updated Successfully";
	}
	
	public Integer getsem1Total(@PathVariable int a){
		return markRepo.getsem1Total(a);
	}
	
	public Integer getsem2Total(@PathVariable int a){
		return markRepo.getsem2Total(a);
	}
	
	public List<Integer> getsem12Total(){
		return markRepo.getsem12Total();
	}

}
