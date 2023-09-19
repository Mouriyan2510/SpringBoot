package com.soft.StudentDetails.Repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import com.soft.StudentDetails.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	 Page<Student> findAll(Pageable pageable);
	
//	@Query(value="SELECT attendance FROM student where attendance>=90;",nativeQuery=true)
	
	 @Procedure(name = "GetattenById")
	public List<Integer> getattenById();

}
//