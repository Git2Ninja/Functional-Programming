package javaLambdaExpressions;

public class Employee {
	
	String name;
	Integer salary;
	Integer height;
	public Employee(String name, Integer salary, Integer height) {
		super();
		this.name = name;
		this.salary = salary;
		this.height = height;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getSalary() {
		return salary;
	}



	public void setSalary(Integer salary) {
		this.salary = salary;
	}



	public Integer getHeight() {
		return height;
	}



	public void setHeight(Integer height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", height=" + height + "]";
	}
	
	
	

}
