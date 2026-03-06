package main;

import service.Java;
import service.SpringBoot;
import service.Telusko;

class Alpha
{
	
	public void alpha() {
		//Statement
		//logic
	}
}

class Beta extends Alpha
{
	public void beta() 
	{
		//Statement
//		Alpha a = new Alpha();
//		a.alpha();
		alpha();
	}
}
public class LaunchApp {
	public static void main(String[] args) 
	{
		//Constructor Injection
		Telusko t = new Telusko(new SpringBoot());//Target Class
		
//		Java java = new Java();
		
		
		//Setter Injection
//		t.setCourse(new Java());// Dependency Injection --> Injecting dependent object into target class 
		
		Boolean status = t.buyTheCourse(4500.20);
		if(status)
			System.out.println("Course Enrolled.");
		else
			System.out.println("Failed to Enroll in the Course.");
	}
}
