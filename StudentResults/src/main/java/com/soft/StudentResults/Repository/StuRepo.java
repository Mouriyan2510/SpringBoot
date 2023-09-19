package com.soft.StudentResults.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.StudentResults.entity.Results;

public interface StuRepo extends JpaRepository<Results, Integer>{

@Query(value="INSERT INTO `results` (`id`, `name`, `percentage`, `roll_number`, `total_marks`) VALUES ('?', '?', '?', '?', '');",nativeQuery = true)
public List<Results> InsertToDbsingle(Results r);


@Query(value="UPDATE results SET total_marks = CASE  WHEN percentage >= 90 THEN total_marks + 5  ELSE total_marks END WHERE id > ?;",nativeQuery = true)
public String add5Mark(int a);

@Query(value="select total_marks from results",nativeQuery = true)
public List<Integer> getallmarks();

}
