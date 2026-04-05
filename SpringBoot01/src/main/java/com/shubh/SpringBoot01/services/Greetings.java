package com.shubh.SpringBoot01.services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Greetings implements IGreetings {
	
	public Greetings() 
	{
	System.out.println("Greetings Bean Created");	
	}
	
	@Autowired
	private LocalTime time;
	
	@Override
	public String generateWish(String name) {
		
		int hour = time.getHour();
		if(hour<12) return "Good Morning "+ name;
		else if(hour<16) return "Good Afternoon "+ name;
		else if(hour<20) return "Good Evening "+ name;
		else return "Good Night "+ name;
	}

}
