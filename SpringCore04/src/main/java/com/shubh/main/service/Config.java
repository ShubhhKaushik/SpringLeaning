package com.shubh.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{

	public Config() 
	{
	
		System.out.println("Confid Bean is Created");
		
	}
	
	
	@Bean
	public Password createPasswordBean() {
		
		Password pw = new Password("SHAA");
		return pw;
	}
}
