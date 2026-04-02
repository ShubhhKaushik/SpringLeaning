package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.Employee;

public class LaunchApp1 
{

	public static void main(String[] args) 
	{
		//Application Context
		
		ApplicationContext con = new ClassPathXmlApplicationContext("applicationConfig.xml");
		
		
		Employee emp1 = con.getBean("emp1", Employee.class);
		System.out.println(emp1);
		System.out.println(emp1.employeetask());
		
	}

}
