package com.soft.Transactional;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sender")
public class SenderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int totalAmount;
	private int sentAmount;
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
	public int getSent_amount() {
		return sentAmount;
	}
	public void setSent_amount(int sentAmount) {
		this.sentAmount = sentAmount;
	}
	
	

}
