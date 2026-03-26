package com.shubh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shubh.services.Telusko;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		//Application Context
		
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		Telusko t = con.getBean(Telusko.class);
		boolean status = t.buyTheCourse(4545.45);
		if(status) 
		{
			System.out.println("Enrolled in the Course");
		}else 
		{
			System.out.println("Problem occurred");
		}
	}

}
