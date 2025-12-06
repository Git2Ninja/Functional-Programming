package javaLambdaExpressions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierGetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Define a Suppliar that returns a constant value
		Supplier <Integer> constantSupplier = () -> new Random().nextInt();
		
		Integer result = constantSupplier.get();
		
		System.out.println(result);
		
		
	}

}
