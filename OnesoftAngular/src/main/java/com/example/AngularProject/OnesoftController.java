package com.example.AngularProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class OnesoftController {
	
	@Autowired
	OnesoftService os;
	
	
	@PostMapping("Onesoft")
	public OnesoftEntity post(@RequestBody OnesoftEntity o) {
		return os.post(o);
	}
	@GetMapping("Onesoft")
	public List<OnesoftEntity> get(){
		return os.get();
	}
	
	@GetMapping("Onesoft/{a}")
	public OnesoftEntity getid(@PathVariable int a) {
		return os.getid(a);
	}
	@PutMapping("/Onesoft/{a}")
	public OnesoftEntity update(@RequestBody OnesoftEntity e,@PathVariable int a){
		return os.update(e,a);
	}
	@DeleteMapping("Onesoft/{a}")
	public OnesoftEntity delet(@PathVariable int a) {
		return os.delet(a);
	}

}
