package com.shubh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shubh.main.config.JavaConfiguration;
import com.shubh.services.Greeting;




public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
		Greeting greet = con.getBean(Greeting.class);
		System.out.println(greet.getGreetings("Shubh Kaushik"));
		
	}

}
