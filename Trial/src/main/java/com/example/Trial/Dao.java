package com.example.Trial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
	
	@Autowired
	Repo r;

	public String post(Book b) {
		r.save(b);
		return "Posted Successfully";
	}
	
	public Book getid(int id) {
		return r.findById(id).get();
	}

	public List<Book> getAll() {
		return r.getAll();
	}

	public Book gett(int id) {
		return r.gett(id);
	}
}
