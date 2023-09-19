package com.soft.loan.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.loan.dao.InstantFibeDao;
import com.soft.loan.entity.InstantFibeCustomer;
@Service
public class InstantFibeService {

	@Autowired
	InstantFibeDao fibedao;
	
	
	public String setCusDetails(InstantFibeCustomer ifc) {
		return fibedao.setCusDetails(ifc);
	}
	
	public InstantFibeCustomer getById(@PathVariable int a){
		return fibedao.getById(a);
	}
	
	public List<InstantFibeCustomer> getAll(){
		return fibedao.getAll();
	}

	public String updateById(InstantFibeCustomer a){
		return fibedao.updateById(a);
	}
	
//	public List<InstantFibeCustomer> inserta(List<InstantFibeCustomer> a){
//		List<InstantFibeCustomer> ert=fibedao.getAll();
//		List<InstantFibeCustomer> et=ert.stream().filter(t-> t.getAge()>25).collect(Collectors.toList());
//				return fibedao.inserta(et);
//	}

	
	public String updatemsg( InstantFibeCustomer fc, int a) {
		InstantFibeCustomer kfc=fibedao.getById(a);
		fc.setId(kfc.getId());
		fc.setAadhar(kfc.getAadhar());
		fc.setAge(kfc.getAge());
		fc.setIncome(kfc.getIncome());
		fc.setName(kfc.getName());
		fc.setOccupation(kfc.getOccupation());
		fc.setPan(kfc.getPan());
		return fibedao.updatemsg(fc);
	}
			
	
}



