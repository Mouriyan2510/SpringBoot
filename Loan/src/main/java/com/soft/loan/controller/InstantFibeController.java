package com.soft.loan.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.soft.loan.entity.Car;
import com.soft.loan.entity.InstantFibeCustomer;
import com.soft.loan.service.InstantFibeService;

@RestController
@RequestMapping("instant")
public class InstantFibeController {
	@Autowired
	InstantFibeService fibeser;
	
	@PostMapping("insert")
	public String setCusDetails(@RequestBody InstantFibeCustomer ifc){
		return fibeser.setCusDetails(ifc);
	}
	
	@GetMapping("getbyId/{a}")
	public InstantFibeCustomer getById(@PathVariable int a){
		return fibeser.getById(a);
	}

	@GetMapping("getAll")
	public List<InstantFibeCustomer> getAll(){
		return fibeser.getAll();
	}
	
	@PostMapping("update/{a}")
	public String updateById(@RequestBody InstantFibeCustomer a){
		return fibeser.updateById(a);
	}
	
//	@PostMapping("inserta")
//	public List<InstantFibeCustomer> inserta(@RequestBody List<InstantFibeCustomer> a){
//		return fibeser.inserta(a);
//	}
	
	@PostMapping("/updatemsg/{a}")
	public String updatemsg(@RequestBody InstantFibeCustomer fc,@PathVariable int a) {
		return fibeser.updatemsg(fc,a);  
	}
	
	
	RestTemplate rest=new RestTemplate();
	@GetMapping("gettesthello")
	public List<Car> gettesthello() {
		String url="http://localhost:8080/car/getIdAll";
		ResponseEntity<List<Car>> response=rest.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference <List<Car>>() {
		});
		List <Car> value=response.getBody();
		List <Car> at=value.stream().filter(y->y.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
		at.stream().forEach(i-> {
			int z=i.getPrice()+(i.getPrice()+5)/100;
			i.setPrice(z);
		});
		return at;
	}

}
