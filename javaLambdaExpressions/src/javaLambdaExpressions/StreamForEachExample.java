package javaLambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple","Banana","Mango");
		fruits.stream()
		.forEach((element) -> System.out.println(element));
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.forEach((element) -> System.out.println(element));
		
		numbers.stream().sorted(Comparator.reverseOrder())
		.forEach((element) -> System.out.println(element));
		
	}

}
