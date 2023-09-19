package com.soft.JUnit;

public class Calculator {
	public void div(int a, int b) {
		System.out.println("Division: " + (a / b));
	}

	public void mul() {
		System.out.println("Multiplication: " + (10 * 30));
	}

	public int add(int a, int b) {
		return (a + b);
	}

	public void sub() {
		System.out.println("Subraction: " + (20 - 1));
	}

	public String getString() {
		String a = "Mouriyan";
		char[] b = a.toCharArray();
		String c = "";
		for (int i = b.length - 1; i >= 0; i--) {
			c = c + b[i];
		}
		System.out.println(c);
		return c;
	}

}
