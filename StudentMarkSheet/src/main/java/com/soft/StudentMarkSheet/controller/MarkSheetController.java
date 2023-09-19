package com.soft.StudentMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.StudentMarkSheet.entity.MarkSheet;
import com.soft.StudentMarkSheet.service.MarkSheetService;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("marksheet")
public class MarkSheetController {
	
	@Autowired
	MarkSheetService markser;
	
	@PostMapping("insertall")
	public String insertall(@RequestBody MarkSheet ms) {
		return markser.insertall(ms);
	}
	
	@GetMapping("getById/{a}")
	public MarkSheet getById(@PathVariable int a) {
		return markser.getById(a);
	}
	
	@GetMapping("getAll")
	public List<MarkSheet> getAll() {
		return markser.getAll();
	}
	
	@PostMapping("updateById/{a}")
	public String updateById(@RequestBody MarkSheet a) {
		return markser.updateById(a);
	}
	
	@GetMapping("getsem1Total/{a}")
	public Integer getsem1Total(@PathVariable int a){
		return markser.getsem1Total(a);
	}
	
	@GetMapping("getsem2Total/{a}")
	public Integer getsem2Total(@PathVariable int a){
		return markser.getsem2Total(a);
	}
	
	@GetMapping("getsem12Total")
	public List<Integer> getsem12Total(){
		return markser.getsem12Total();
	}
	
}
