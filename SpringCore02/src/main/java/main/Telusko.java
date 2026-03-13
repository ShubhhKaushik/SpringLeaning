package main;

import io.micrometer.observation.transport.Propagator.Setter;
import service.ICourse;

public class Telusko 
{
	private ICourse course;
	
	public Telusko() 
	{	
		super();
		System.out.println("Telusko Bean Created");
	}
	
	public Telusko(ICourse course) 
	{
		super();
		System.out.println("Constructor Injection");
		this.course = course;
		
	}
	
	
	public void setCourse(ICourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}


	public boolean buyTheCourse(Double amount)
	{
		 return course.getTheCourse(amount);
	}
}
