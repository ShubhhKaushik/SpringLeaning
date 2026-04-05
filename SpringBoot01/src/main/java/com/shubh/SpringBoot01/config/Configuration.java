package com.shubh.SpringBoot01.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	public Configuration() 
	{
		System.out.println("Config Bean Created");
	}
	
	@Bean
	public LocalTime createTime() {
		return LocalTime.now();
	}
	
}
