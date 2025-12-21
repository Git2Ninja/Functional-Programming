package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employeee{
	private String name;
	private Integer age;
	
	public Employeee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

public class EmployeeCollectExample {

    public static void main(String[] args) {

        List<Employeee> employees = Arrays.asList(
                new Employeee("Bob", 34),
                new Employeee("Rob", 45),
                new Employeee("Chuck", 32),
                new Employeee("Bob", 29) // duplicate name for distinct demo
        );

        // 1️⃣ Map Employee → Name
        // 2️⃣ Remove duplicates
        // 3️⃣ Collect into a List
        List<String> uniqueEmployeeNames =
                employees.stream()
                        .map(Employeee::getName)
                        .distinct()
                        .collect(Collectors.toList());
        List<Integer> uniqueEmployeeAges =
                employees.stream()
                        .map(Employeee::getAge)
                        .distinct()
                        .collect(Collectors.toList());

        // 4️⃣ Terminal action
        System.out.println("The employees grouped by names");
        uniqueEmployeeNames.forEach(System.out::println);
        System.out.println("The employees grouped by ages");
        uniqueEmployeeAges.forEach(System.out::println);
    }
}
