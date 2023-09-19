package com.example.Trial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Dao d;
	public String post(Book b) {
		return d.post(b);
	}
	public Book getid(int id) {
		return d.getid(id);
	}

	public List<Book> getAll(){
		return d.getAll();
	}
	
	public Book gett(int id) {
		return d.gett(id);
	}

}
