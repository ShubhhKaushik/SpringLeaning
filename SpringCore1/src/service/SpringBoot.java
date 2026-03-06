package service;

public class SpringBoot implements ICourse

{

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("SpringBoot Course is Purchased and Fees is paid "+ amount);
		return true;
	}
	
}
