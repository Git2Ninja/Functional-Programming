package javaLambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbersMin = Arrays.asList(2,3,4,4,5,6,7,8,9);
		Optional<Integer> resultMin = numbersMin.stream()
		.min((o1,o2) -> o1.compareTo(o2));
		System.out.println("Minimum number :" + resultMin.get());
		
		List<Integer> numbersMax = Arrays.asList(2,3,4,4,5,6,7,8,9);
		Optional<Integer> resultMax = numbersMax.stream()
		.max((o1,o2) -> o1.compareTo(o2));
		System.out.println("Maximum number :" + resultMax.get());


	}

}
