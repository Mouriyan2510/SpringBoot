package com.soft.gst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.gst.entity.GstEntity;

public interface GstRepository extends JpaRepository<GstEntity, Integer>{
	@Query(value="SELECT * FROM gst_details where hsn=?",nativeQuery=true)
	public GstEntity getbyhsn(int a);
	
	@Query(value="SELECT percentage FROM gst_details where hsn=?",nativeQuery=true)
	public int getPercentageByHsn(int a);
	
	@Query(value = "select percentage from gst_details",nativeQuery = true)
	public List<Integer> getallPercentage();

}
 