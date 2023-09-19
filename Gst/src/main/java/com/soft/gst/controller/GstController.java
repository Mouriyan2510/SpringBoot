package com.soft.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soft.gst.entity.GstEntity;
import com.soft.gst.service.GstService;

@RestController
@RequestMapping("gst")
public class GstController {

	@Autowired
	GstService gstser;
	
	@PostMapping("insertalldata")
	public String insertalldata(@RequestBody GstEntity g) {
		return gstser.insertalldata(g);
	}
	
	@GetMapping("getbyid/{a}")
	public GstEntity getbyid(@PathVariable int a) {
		return gstser.getbyid(a);
	}
	
	@GetMapping("getbyidall")
	public List<GstEntity> getbyidall() {
		return gstser.getbyidall();
	}
	@GetMapping("getPerByHsn/{a}")
	public Integer getPercentageByHsn(@PathVariable int a) {
		return gstser.getPercentageByHsn(a);
	}
	
	
	
	@GetMapping("getallPercentage")
	public List<Integer> getallPercentage() {
		return gstser.getallPercentage();
	}

	
}
