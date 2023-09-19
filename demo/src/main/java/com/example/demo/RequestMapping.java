package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@org.springframework.web.bind.annotation.RequestMapping(value="/admin")
public class RequestMapping {
	@GetMapping(value="/dam/{a}")
	public List<Integer> square(@PathVariable int a) {
		ArrayList <Integer> g=new ArrayList<> ();
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				g.add(i);
			}
		}
		return g;
	}
}
