package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Controller {
	@Autowired
	PService ps;
	
	@PostMapping("AngularProject")
	public ProjectEntity post(@RequestBody ProjectEntity p) {
		return ps.post(p);
	}
	@GetMapping("AngularProject")
	public List<ProjectEntity> get(){
		return ps.get();
	}
	@DeleteMapping("AngularProject/{a}")
	public ProjectEntity delet(@PathVariable int a) {
		return ps.delet(a);
	}
	@GetMapping("AngularProject/{a}")
	public ProjectEntity getid(@PathVariable int a) {
		return ps.getid(a);
	}
	
	@PutMapping("/AngularProject/{a}")
	public ProjectEntity update(@RequestBody ProjectEntity e,@PathVariable int a){
		return ps.update(e,a);
	}

}
