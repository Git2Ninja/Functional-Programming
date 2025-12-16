package javaLambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	

}

public class SortUserExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> users = Arrays.asList(
				new User("Rom",30),new User("Tom",48),new User("Alena",23));
	//Traditional Approach	
//		Comparator<User> userComparator = new Comparator <User>() {
//			@Override
//			public int compare(User a1, User a2) {
//				return a1.getAge() - a2.getAge();
//			}
//		};
		//Lambda Expression Logic 1
//		List <User> result = users.stream()
//		.sorted((a1,a2) -> a1.getAge() - a2.getAge())
//		.toList();
//		
//		System.out.println(result.toString());
//		//Lambda Expression Logic 2	
//		List <User> result = users.stream()
//		.sorted(Comparator.comparingInt(User::getAge))
//		.toList();
		
		//Lambda Expression Descending Order
		List <User> result = users.stream()
		.sorted(Comparator.comparingInt(User::getAge).reversed())
		.toList();
		
		List <User> result1 = users.stream()
		.sorted(Comparator.comparingInt(User::getAge))
		.toList();
		
		List <User> result2 = users.stream()
		.sorted(Comparator.comparing(User::getName))
		.toList();
		
		List <User> result3 = users.stream()
		.sorted(Comparator.comparing(User::getName).reversed())
		.toList();
		
		
		System.out.println(result.toString());		
		
		System.out.println(result1.toString());		
		
		System.out.println(result2.toString());
		
		System.out.println(result3.toString());
		
		
	}
	
	
	

}
