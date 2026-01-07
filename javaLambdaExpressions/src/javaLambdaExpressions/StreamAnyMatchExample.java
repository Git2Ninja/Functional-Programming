package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Employeeee{
	private int id;
	private String name;
	private double salary;
	public Employeeee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}

public class StreamAnyMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employeeee> employees = Arrays.asList(
				new Employeeee(23,"Tom",100),
				new Employeeee(24,"Eddie",1000),
				new Employeeee(25,"Lillian",10000)
				);
		
		boolean hasSpecificSalary = employees.stream().anyMatch(employee -> employee.getSalary() ==100);
		
		System.out.println("Is there employee with specified salary? :" +hasSpecificSalary);

	}

}
