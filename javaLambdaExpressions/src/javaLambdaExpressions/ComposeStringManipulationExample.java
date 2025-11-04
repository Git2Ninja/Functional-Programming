package javaLambdaExpressions;

import java.util.function.Function;

public class ComposeStringManipulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <String,String> strip = str -> str.strip();
		System.out.println(strip.apply("              Jack hello "));
		
		Function <String, String> toUpperCase = str -> str.toUpperCase();
		System.out.println(toUpperCase.apply( "           Hello"));
		
		Function<String, String> trim = String::strip;
		Function<String, String> toLower = String::toLowerCase;
		Function<String, String> removeSpecialChars = s -> s.replaceAll("[^a-z0-9 ]", "");
		Function<String, String> normalizeSpaces = s -> s.trim().replaceAll("\\s+", " ");
		
		Function<String, String> sanitize =
		        trim
		        .andThen(toLower)
		        .andThen(removeSpecialChars)
		        .andThen(normalizeSpaces);
		
		
		System.out.println(sanitize.apply("   Jack    Hello!!! 🤝🔥   ")); 
		
		Function<String, String> normalizeUnicodeQuotes = 
		        s -> s.replace("’", "'").replace("“", "\"").replace("”", "\"");
		        
		        sanitize = sanitize.compose(normalizeUnicodeQuotes);
		        
		        Function<String, String> addA = s -> "A" + s;
		        Function<String, String> addB = s -> "B" + s;     
		        Function<String, String> composed = addA.compose(addB);
		        System.out.println(composed.apply("X"));
		        
		        Function<String, String> strip1 = String::strip;
		        Function<String, String> toLower1 = String::toLowerCase;
		        Function<String, String> normalizeSpaces1 = s -> s.replaceAll("\\s+", " ");

		        Function<String, String> sanitize1 =
		                strip1
		                .andThen(toLower1)
		                .andThen(normalizeSpaces1);
		        
		        Function<String, String> replaceAt = s -> s.replace("@", "at ");

		        sanitize1 = sanitize1.compose(replaceAt);
		        
		        System.out.println(sanitize1.apply("  @Jack Developer  "));


	}

}
