package com.soft.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class Confi {
	
	@Bean
	public RestTemplate ft() {
		return new RestTemplate();
	}
	
		
	}
