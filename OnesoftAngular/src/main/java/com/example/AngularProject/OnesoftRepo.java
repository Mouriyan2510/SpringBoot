package com.example.AngularProject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnesoftRepo extends JpaRepository<OnesoftEntity, Integer>{

}
