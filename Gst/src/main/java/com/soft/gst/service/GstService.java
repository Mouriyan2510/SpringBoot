package com.soft.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.soft.gst.dao.GstDao;
import com.soft.gst.entity.GstEntity;
@Service
public class GstService {

	@Autowired
	GstDao gstdao;
	public String insertalldata(GstEntity g) {
		return gstdao.insertalldata(g);
	}
	public GstEntity getbyid(int a) {
		return gstdao.getbyid(a);
	}
	
	
	public List<GstEntity> getbyidall() {
		return gstdao.getbyidall();
	}
	
	public GstEntity getbyhsn(@PathVariable int a) {
		return gstdao.getbyhsn(a);
	}
	
	
	public Integer getPercentageByHsn(@PathVariable int a) {
		return gstdao.getPercentageByHsn(a);
	}
	public List<Integer> getallPercentage() {
		return gstdao.getallPercentage();
	}

}
