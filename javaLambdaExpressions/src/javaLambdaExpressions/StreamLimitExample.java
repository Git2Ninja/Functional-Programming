package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana","Cherry","Mangoe","Orange");
		List<String> result =fruits.stream()
		.limit(3)
		.toList();//limit the first 3 elements
		
		System.out.println(result);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,6,6,6,7,8,9,10);
		
		
		List<Integer> result1 =numbers.stream()
		.filter((number)-> number % 2==0)
		.distinct()//removes duplicates
		.skip(2)//skip the first n elements of a stream
		.limit(5)//limits result to 5 elements
		.toList();
		System.out.println(result1);
		
		
	}

}
