package javaLambdaExpressions;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traditional Way:
		
		//We use anonymous class
		Function<String,String> function = new Function<String,String>(){
			@Override
			public String apply(String s) {
				return s.toUpperCase();
			}
		};
		String result = function.apply("Ramesh");
		System.out.println(result);
		
		
		Function<String, String> functional1 = message -> 
			message.toUpperCase();
			System.out.println(functional1.apply(result));
		
	}

}
