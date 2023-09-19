package com.soft.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.bank.entity.BankEntity;
import com.soft.bank.service.BankService;

@RestController
@RequestMapping("bank")
public class BankController {
	@Autowired
	BankService bankser;
	
	@PostMapping("insertalldata")
	public String insertalldata(@RequestBody List<BankEntity> be) {
		return bankser.insertalldata(be);
	}
	
	@GetMapping("getoneiddetail/{a}")
	public BankEntity getoneiddetail(@PathVariable int a) {
		return bankser.getoneiddetail(a);
	}
	
	@GetMapping("getalliddetail")
	public List<BankEntity> getalliddetail() {
		return bankser.getalliddetail();
	}
	

}
