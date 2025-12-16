package javaLambdaExpressions;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierGetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Supplier that generates a random token
		Supplier<Integer> tokenSupplier = () -> new Random().nextInt();

		// Shared mutable token storage,wrapper class
		AtomicInteger validToken = new AtomicInteger(-1);

		// Consumer 1: saves the token as the valid token
		
		/*
		 * this is the algorithm that will save the token to AtomicInteger,
		 * hence validToken is called.
		 */
		//
		Consumer<Integer> saveToken = (value) -> {
		    validToken.set(value);
		    System.out.println("✓ Token saved as validToken: " + value);
		};
		
		// Consumer 2: checks if supplied value matches validToken
		Consumer<Integer> validateToken = (value) -> {
		    if (value.equals(validToken.get())) {
		        System.out.println("✔ VALID TOKEN SUPPLIED: " + value);
		    } else {
		        System.out.println("✘ INVALID TOKEN: " + value);
		    }
		};
		
		
		// Generate token
		Integer newToken = tokenSupplier.get();
		Integer newToken1 = tokenSupplier.get();
		System.out.println("Generated Token: " + newToken);
		// Save token
		saveToken.accept(newToken);

		// Validate token
		validateToken.accept(newToken);
		
		

		// Clear the AtomicInteger after the flow is done
		validToken.set(0);
		System.out.println("✔ Token storage cleared.");
		
		
	}
}