package com.soft.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class AsserClassProgram {
	Calculator c=new Calculator();
	@Test
	public void testEquals() {
		assertEquals(c.add(10, 6), 16);
	}
	@Test
	public void testNull() {
		assertNull("Nisha", null);
	}
	@Test
	public void testSame() {
		assertSame("Nisha", "Nisha");
	}
	@Test
	public void testArray() {
		int[]a= {4,5,6};
		int[]b= {4,5,6};
		assertArrayEquals(a,b);
	}
	@Test
	public void testNotEquals() {
		assertNotEquals(7, 5);
	}
	@Test
	public void testNotNull() {
		assertNotNull("Nisha", null);
	}
	@Test
	public void testNotSame() {
		assertNotSame("Nisha", "Mouri");
	}
	@Test
	public void testTrue() {
		int a= 5;
		int b= 5;
		boolean c=(a==b);
		assertTrue(c);
	}
	@Test
	public void testFalse() {
		String a="Mouri";
		String b="Nisha";
		boolean c=(a.length()!=b.length());
		assertFalse(c);
	}
	@Test
	public void Same() {
		assertSame("Mouriyan", "Nisha");
	}
//c.getString("Mouriyan");
}
