package javaLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Vuyo", 10000, 1));
		employees.add(new Employee("Thembi", 15000, 2));
		employees.add(new Employee("Nthabi", 20000, 3));
		
		Collections.sort(employees ,new SortEmployee());
		
		System.out.println("Traditional non lambda route"+employees);
		
		Collections.sort(employees, (o1,o2) -> o2.getSalary() - o1.getSalary());
		System.out.println("Lambda route "+employees);
	}

}

class SortEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o2.getSalary() - o1.getSalary();
	}
	
}