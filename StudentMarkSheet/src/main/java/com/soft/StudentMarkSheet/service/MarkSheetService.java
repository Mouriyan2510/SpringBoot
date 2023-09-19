package com.soft.StudentMarkSheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.StudentMarkSheet.dao.MarkSheetDao;
import com.soft.StudentMarkSheet.entity.MarkSheet;
@Service
public class MarkSheetService {

	@Autowired
	MarkSheetDao markdao;
	
	
	public String insertall(MarkSheet ms) {
		MarkSheet mss=new MarkSheet();
		mss.setId(ms.getId());
		mss.setRollNumber(ms.getRollNumber());
		mss.setSem1Practicals(ms.getSem1Practicals());
		mss.setSem1Theory(ms.getSem1Theory());
		mss.setSem1Total(ms.getSem1Practicals()+ms.getSem1Theory());
		mss.setSem2Practicals(ms.getSem2Practicals());
		mss.setSem2Theory(ms.getSem2Theory());
		mss.setSem2Total(ms.getSem2Practicals()+ms.getSem2Theory());
		return markdao.insertall(mss);
	}
	
	
	public MarkSheet getById(@PathVariable int a) {
		return markdao.getById(a);
	}
	
	public List<MarkSheet> getAll() {
		return markdao.getAll();
	}
	
	public String updateById(@RequestBody MarkSheet a) {
		return markdao.updateById(a);
	}
	
	public Integer getsem1Total(@PathVariable int a){
		return markdao.getsem1Total(a);
	}
	
	public Integer getsem2Total(@PathVariable int a){
		return markdao.getsem2Total(a);
	}
	
	public List<Integer> getsem12Total(){
		return markdao.getsem12Total();
	}
	

}
