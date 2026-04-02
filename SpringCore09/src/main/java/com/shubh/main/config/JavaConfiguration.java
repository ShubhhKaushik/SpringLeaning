package com.shubh.main.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.shubh"})
public class JavaConfiguration 
{
	public JavaConfiguration() 
	{
		System.out.println("JavaConfig Bean Created");
	}
	
	@Bean
	public LocalDateTime createTimeObject()
	{
		return LocalDateTime.now();
	}
}
