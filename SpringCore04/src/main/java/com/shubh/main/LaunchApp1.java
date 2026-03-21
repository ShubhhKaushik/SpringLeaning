package com.shubh.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shubh.main.service.Password;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationConfig.xml");
		Password p= container.getBean(Password.class);
		p.PasswordAlgoUsed();
		
	}

}
