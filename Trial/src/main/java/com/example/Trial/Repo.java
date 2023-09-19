package com.example.Trial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Book, Integer>{
	
	@Query(value="select * from book_details",nativeQuery = true)
	public List<Book>getAll();
	
	@Query(value="select r from Book r where r.id=:id")
	public Book gett(@Param("id") int id);

}
