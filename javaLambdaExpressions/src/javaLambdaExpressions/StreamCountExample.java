package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class StreamCountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,6,6,6,7,8,9,10);
		long count = numbers.stream()
		.filter((number)-> number % 2==0)		
		.count();
		
		System.out.println(count);
		

	}

}
