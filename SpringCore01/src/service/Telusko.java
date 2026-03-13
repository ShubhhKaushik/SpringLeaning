package service;

public class Telusko 
{
	private ICourse course;
	
	public Telusko() 
	{
		
	}
	
	public Telusko(ICourse course) 
	{
		this.course = course;
	}
	
	
	public void setCourse(ICourse course) {
		this.course = course;
	}


	public boolean buyTheCourse(Double amount)
	{
//		Java j = new Java();
//		Boolean status = j.getTheCourse(amount);
//		return status; CREATING TIGHT COUPLING
		 return course.getTheCourse(amount);
	}
}
