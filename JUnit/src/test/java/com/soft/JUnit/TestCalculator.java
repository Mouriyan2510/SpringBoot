package com.soft.JUnit;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	Calculator c=new Calculator();
	@Before
	public void print() {
		System.out.println("Hello");
	}
	@org.junit.Test
	public void add() {
		c.add(20, 20);
	}
	@org.junit.Test
	public void div() {
		c.div(30, 9);
	}
	@org.junit.Test
	public void mul() {
		System.out.println("Multiplication: "+(10*30));
	}
	@org.junit.Test
	public void sub() {
		System.out.println("Subraction: "+(20-1));
	}
	@org.junit.Test
	public void getString() {
		assertEquals(c.getString(), "nayiruoM");
	}
	@After
	public void printlnn() {
		System.out.println("Bye");
	}
	
	
}
