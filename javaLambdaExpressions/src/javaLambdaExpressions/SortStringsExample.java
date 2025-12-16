package javaLambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> fruits = Arrays.asList("Lebo","Ona","Hloni");
		List <String> result = fruits.stream().sorted().toList();
		
		System.out.println(result);
		
		List<String> result1 = fruits.stream().sorted(Comparator.reverseOrder()).toList();
		
		System.out.println(result1);
	}

}
