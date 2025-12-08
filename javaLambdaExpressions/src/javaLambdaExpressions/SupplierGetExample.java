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
        // Shared mutable token storage
        AtomicInteger validToken = new AtomicInteger();
        // Consumer 1: saves the token as the valid token
        Consumer<Integer> saveToken = (value) -> {
            validToken.set(value);
            System.out.println("✓ Token saved as validToken: " + value);
        };
        // Consumer 2: checks if supplied value matches validToken
        Consumer<Integer> validateToken = (value) -> {
            if (value == validToken.get()) {
                System.out.println("✔ VALID TOKEN SUPPLIED: " + value);
            } else {
                System.out.println("✘ INVALID TOKEN: " + value);
            }
        };
        // Generate token
        Integer newToken = tokenSupplier.get();
        System.out.println("Generated Token: " + newToken);
        // Save token
        saveToken.accept(newToken);
        // Validate token
        validateToken.accept(newToken);
		
	}

}