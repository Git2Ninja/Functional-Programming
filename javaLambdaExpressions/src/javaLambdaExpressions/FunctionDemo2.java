package javaLambdaExpressions;

import java.util.function.Function;

public class FunctionDemo2 {
	
	/*
	 * andThen() method allows you to chain functions together.First,the
	 * current function is applied then the after function is applied 
	 * to the result of the first function
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traditional Method
		
		 //Define a function that converts a string to upper case
		
		/*
		 * If your lambda expression has only one expression, 
		 * you don’t need to enclose it in curly braces ({}).
		 *
		 * Remember, the syntax is:
		 * expressionVariableName = () -> expression;
		 */
	
		
		Function <String,String> toUpperCase = (str) ->  str.toUpperCase();
		
		String result = toUpperCase.apply("Satoshi");
		System.out.println("Name converted to uppercase is :" +result);
		
		//Define another function that calculates length of string
		
		Function <String,Integer> StringLength = (str)-> str.length();
		
		Function <String,Integer> upperCaseThenLength = toUpperCase.andThen(StringLength);
		//Lambda Method
		int length = upperCaseThenLength.apply("Satoshi");
		System.out.println("Length of name is :"+length);
	}

}
