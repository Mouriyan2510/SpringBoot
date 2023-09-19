package com.soft.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soft.bank.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer>{

}
