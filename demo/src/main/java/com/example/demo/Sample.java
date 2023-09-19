package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping(value = "/server1")
	public String msg() {
		return "Hello World";
	}

	@GetMapping(value = "/myname")
	public String msg1() {
		return "Mouriyann";
	}

	@GetMapping(value = "/total/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a / b;
	}

	@GetMapping(value = "/odd/{a}")
	public String even(@PathVariable int a) {
		if (a % 2 == 0) {
			return a + " is even";
		} else {
			return a + " is odd";
		}
	}

	@GetMapping(value = "/Square/{a}")
	public int square(@PathVariable int a) {
		return a * a;
	}

	@GetMapping(value = "/Palindrome/{a}")
	public String palindrome(@PathVariable String a) {
		char[] b = a.toCharArray();
		String c = "";
		for (int i = b.length - 1; i >= 0; i--) {
			c = c + b[i];
		}
		if (a.equals(c)) {
			return "Palindrome";
		} else {
			return "Not Palindrome";
		}
	}

	@GetMapping(value = "/Prime/{a}")
	public String prime(@PathVariable int a) {
		boolean temp = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				temp = false;
			} else {
				continue;
			}
		}
		if (temp) {
			return "Prime";
		} else {
			return "Not prime";
		}
	}

	@GetMapping("server6")
	public List<Car> car1(@RequestBody List<Car> c) {
		return c.stream().filter(u-> u.getColor().equalsIgnoreCase("black")).collect(Collectors.toList());
//		return c.stream().filter(u-> u.getColor().equalsIgnoreCase("black")).count();
		
	}
	@GetMapping("server7")
	public List<Car> car2(@RequestBody List<Car> c1) {
		List<Car>ccc= c1.stream().filter(f-> f.getCc()>2500).collect(Collectors.toList());
		ccc.forEach(u-> { int t=u.getPrice()+(u.getPrice()*5)/100;
				u.setPrice(t);
		});
		return ccc;
	}
//	@GetMapping("server8")
//	public Car car1(@RequestBody Car) {
//		return c;
//	}
	@GetMapping(value = "/root/{a}")
	public String root(@PathVariable int a) {
		boolean temp = true;
		for (int i = 2; i < a; i++) {
			if (i * i == a) {
				temp = false;
			} else {
				continue;
			}
		}
		if (temp) {
			return "Not Square";
		} else {
			return "quare";
		}
	}
}
