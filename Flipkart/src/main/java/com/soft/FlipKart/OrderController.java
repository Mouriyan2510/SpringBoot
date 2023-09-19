package com.soft.FlipKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	
	@Autowired
	OrderService ordSer;
	
	@PostMapping("postoneObjectData")
	public String postoneObjectData(@RequestBody OrderEntity oe) {
		return ordSer.postoneObjectData(oe);
	}
	
	@DeleteMapping("delete/{a}")
	public String delete(@PathVariable int a) {
		return ordSer.delete(a);
	}
	
	@GetMapping("getAll")
	public List<Object> getAll(){
		return ordSer.getAll();
	}

}
