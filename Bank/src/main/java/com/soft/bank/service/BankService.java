package com.soft.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.bank.dao.BankDao;
import com.soft.bank.entity.BankEntity;
@Service
public class BankService {

	@Autowired
	BankDao bankdao;
	
	
	public String insertalldata(List<BankEntity> be) {
		return bankdao.insertalldata(be);
	}


	public BankEntity getoneiddetail(int a) {
		return bankdao.getoneiddetail(a);
	}


	public List<BankEntity> getalliddetail() {
		return bankdao.getoneiddetail();
	}

}
