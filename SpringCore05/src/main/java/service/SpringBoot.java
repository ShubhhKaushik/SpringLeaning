package service;

public class SpringBoot implements ICourse {
	
	public SpringBoot() 
	{
		System.out.println("SpringBoot Bean Created");	
	}

	@Override
	public Boolean getTheCourse(Double amount) 
	{
		System.out.println("SpringBoot course is purchased and amount paid is "+ amount);
		
		return true;
	}

}
