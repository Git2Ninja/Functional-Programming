package javaLambdaExpressions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream1 = Stream.of("apple","watermelon","ginger");
		List<String> result = stream1.collect(Collectors.toList());
		System.out.println(result);
		
		
		Stream<String> stream2 = Stream.of("apple","watermelon","ginger","apple");
		Set <String> result1 = stream2.collect(Collectors.toSet());
		System.out.println(result1);
		
		Stream<String> stream3 = Stream.of("apple","watermelon","ginger");
		Map<String,Integer> result2 = stream3.collect(Collectors.toMap(
				fruit -> fruit,
				fruit -> fruit.length()				
				));
		System.out.println(result2);
		
		
		
	}

}
