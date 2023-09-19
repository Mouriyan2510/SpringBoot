package com.example.Trial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service sr;
	
	@PostMapping("post")
	public String post(@RequestBody Book b) {
		return sr.post(b);
	}
	
	@GetMapping("get/{id}")
	public Book getid(@PathVariable int id) {
		return	sr.getid(id);
	}
	
	@GetMapping("getAll")
	public List<Book> getAll(){
		return sr.getAll();
	}
	
	@GetMapping("getid/{i}")
	public Book gett(@PathVariable int i) {
		return sr.gett(i);
	}

}
