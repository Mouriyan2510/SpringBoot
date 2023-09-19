package com.soft.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.gst.entity.GstEntity;
import com.soft.gst.repository.GstRepository;
@Repository
public class GstDao {

	@Autowired
	GstRepository gstRepo;
	
	public String insertalldata(GstEntity g) {
		gstRepo.save(g);
		return "Inserted Successfully";
	}

	public GstEntity getbyid(int a) {
		return gstRepo.findById(a).get();
	}

	public List<GstEntity> getbyidall() {
		return gstRepo.findAll();
	}
	
	public GstEntity getbyhsn(@PathVariable int a) {
		return gstRepo.getbyhsn(a);
	}
	
	public Integer getPercentageByHsn(@PathVariable int a) {
		return gstRepo.getPercentageByHsn(a);
	}

	public List<Integer> getallPercentage() {
		return gstRepo.getallPercentage();
	}
	
	
}
