package com.shubh.services;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greeting 
{
	@Autowired
	private LocalDateTime time;
	
	public Greeting() 
	{
		System.out.println("Greeting Bean Created");
	}
	
	public String getGreetings(String name) 
	{
		int hour = time.getHour();
		if(hour<12) return "Good Morning "+ name;
		else if(hour<16) return "Good Afternoon "+ name;
		else if(hour<20) return "Good Evening "+ name;
		else return "Good Night "+ name;
	}
}
