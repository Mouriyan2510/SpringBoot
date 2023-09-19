package com.soft.Transactional;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="receiver")
@Entity
public class ReceiverEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int totalAmount;
	private int receivedAmount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_amount() {
		return totalAmount;
	}
	public void setTotal_amount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getReceived_amount() {
		return receivedAmount;
	}
	public void setReceived_amount(int receivedAmount) {
		this.receivedAmount = receivedAmount;
	}
	
	
}
