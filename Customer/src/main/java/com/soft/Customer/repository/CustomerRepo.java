package com.soft.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soft.Customer.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer>{


}
