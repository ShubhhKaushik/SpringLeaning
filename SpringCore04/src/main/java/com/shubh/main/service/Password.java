package com.shubh.main.service;

public class Password {
	
	String algo;
	
	public Password(String algo) 
	{
		this.algo = algo;
		System.out.println("Password Bean Created");
		
	}
	
	public void PasswordAlgoUsed() 
	{
		
		System.out.println("This password is created using this - "+ algo);
		
	}

}
