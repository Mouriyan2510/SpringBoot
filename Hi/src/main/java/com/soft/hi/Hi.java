package com.soft.hi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Msg")
public class Hi {
	
	@GetMapping("gethi")
	public String getmsg() {
		return "Hi.... I'm Mouriyan";
	}
	
	@GetMapping("test")
		public int getTest() {
			return 90+75;
		}
	}

