package com.shubh.SpringBoot01;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shubh.SpringBoot01.services.Greetings;

@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext Container = SpringApplication.run(SpringBoot01Application.class, args);
		
		Greetings greet = Container.getBean(Greetings.class);
		System.out.println(greet.generateWish("Shubh Kaushik"));
	}

}
