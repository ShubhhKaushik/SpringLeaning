package service;

public class Employee {
	
	private Integer empId;
	
	private String name;
	
	private Double salary;
	
	private String city;
	

	
	public Employee(Integer empId, String name, Double salary, String city)
	{
		super();
		System.out.println("Employee Bean Created");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", city=" + city + 
				 "]";
	}


	public String employeetask() {
		return "Focus on Improving yourself not Proving yourself";
	}
}
