package com.soft.loan.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.soft.loan.entity.InstantFibeCustomer;
import com.soft.loan.repository.InstantFibeRepository;

@Repository
public class InstantFibeDao {

	@Autowired
	InstantFibeRepository fibeRepo;

	public String setCusDetails(InstantFibeCustomer ifc) {
		fibeRepo.save(ifc);
		return "Data Inserted Succesfully";
	}

	public InstantFibeCustomer getById(@PathVariable int a) {
		return fibeRepo.findById(a).get();
	}

	public List<InstantFibeCustomer> getAll() {
		return fibeRepo.findAll();
	}

	public String updateById(InstantFibeCustomer a) {
		fibeRepo.save(a);
		return "Updated Successfully";
	}
	
	public String updatemsg(@RequestBody InstantFibeCustomer fc) {
		fibeRepo.save(fc);
		return "Updated Successfully";
	}

//	public List<InstantFibeCustomer> inserta(List<InstantFibeCustomer> et) {
//		return fibeRepo.saveAll(et);
//	}

}
