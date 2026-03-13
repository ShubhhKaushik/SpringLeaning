package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class LaunchApp2 
{
	public static void main(String[] args) 
	{
		//BeanFactory
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		
		reader.loadBeanDefinitions("applicationConfig.xml");
		Telusko t = beanFactory.getBean(Telusko.class);
		boolean status = t.buyTheCourse(4343.43);
		if(status)
		{
			System.out.println("Enrolled in the Course");
		}else 
		{
			System.out.println("Failed to Enroll");
		}
		
	}
	
}
