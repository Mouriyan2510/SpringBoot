package com.soft.StudentResults.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.StudentResults.dao.StuDao;
import com.soft.StudentResults.entity.Results;
@Service
public class StuService {

	
	@Autowired
	StuDao studao;
	
	
	public String InsertToDb(Results r) {
		return studao.InsertToDb(r);
	}


	public List<Results> InsertToDbsingle(Results r) {
		return studao.InsertToDbsingle(r);
	}


	public String updateByRoll(Results a, int roll) {
		return studao.updateByRoll(a,roll);
	}


	public String add5markpost(List<Results> result) {
		return studao.add5markpost(result);
	}


	public List<Results> getallmarks() {
		return studao.getallmarks();
	}




//	public String add5Mark(Results r) {
//		ArrayList<Results> ar=new ArrayList<>();
//		ar.stream().filter(y-> y.getPercentage()>=90).forEach(u-> {
//			r.setTotalMarks(u.getTotalMarks()+5);
//		});
//		return studao.add5Mark(r);
//	}	

}
