package com.shubh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Telusko 
{
//	@Autowired
//	@Qualifier("java")
	private ICourse course;
	
	public Telusko() 
	{	
		super();
		System.out.println("Telusko Bean Created");
	}
	
	@Autowired
	public Telusko(@Qualifier("java") ICourse course) 
	{
		super();
		System.out.println("Constructor Injection");
		this.course = course;
		
	}
	
//	@Autowired
//	@Qualifier("springBoot")
	public void setCourse(ICourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}


	public boolean buyTheCourse(Double amount)
	{
		 return course.getTheCourse(amount);
	}
}
