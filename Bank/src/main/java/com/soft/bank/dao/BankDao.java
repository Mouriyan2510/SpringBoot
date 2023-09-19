package com.soft.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.soft.bank.entity.BankEntity;
import com.soft.bank.repository.BankRepository;
@Repository
public class BankDao {

	@Autowired
	BankRepository bankRepo;
	
	public String insertalldata(List<BankEntity> be) {
		bankRepo.saveAll(be);
		return "Inserted all data Succesfully";
	}

	public BankEntity getoneiddetail(int a) {
		return bankRepo.findById(a).get();
	}

	public List<BankEntity> getoneiddetail() {
		return bankRepo.findAll();
	}

}
