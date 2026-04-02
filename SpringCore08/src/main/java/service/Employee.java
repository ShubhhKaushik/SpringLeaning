package service;

public class Employee {
	
	private Integer empId;
	
	private String name;
	
	private Double salary;
	
	private String city;
	

	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
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
