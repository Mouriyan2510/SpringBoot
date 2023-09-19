package com.soft.StudentMarkSheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.StudentMarkSheet.entity.MarkSheet;

public interface MarkSheetRepository extends JpaRepository<MarkSheet, Integer>{
	
	@Query(value="select sem1total from mark_sheet where id=?",nativeQuery=true)
	public Integer getsem1Total(int a);
	
	@Query(value="select sem2total from mark_sheet where id=?",nativeQuery=true)
	public Integer getsem2Total(int a);
	
	@Query(value="select sem2total+sem1total from mark_sheet",nativeQuery=true)
	public List<Integer> getsem12Total();

}
