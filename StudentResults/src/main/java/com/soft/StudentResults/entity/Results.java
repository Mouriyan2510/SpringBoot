package com.soft.StudentResults.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="results")//id, rollNumber, name, totalMarks, percentage
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private int roll_Number;
 private String name;
 private int totalMarks;
 private int percentage;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRoll_Number() {
	return roll_Number;
}
public void setRoll_Number(int roll_Number) {
	this.roll_Number = roll_Number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
}
	
 

