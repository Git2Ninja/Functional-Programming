package javaLambdaExpressions;

public class FruitRunnableDemo {
    public static void main(String[] args) {

        // Runnable using Lambda — prints favorite fruits
    	/*
    	 * Type Of Functional Interface: Runnable 
    	 * 
    	 */
        Runnable fruitTask = () -> {
            String[] fruits = {"Apple", "Banana", "Grapes", "Mango"};
            System.out.println("Listing fruits:");
            for(String fruit : fruits) {
                System.out.println("- " + fruit);
            }
        };

        // Assign Runnable to a Thread
        Thread fruitThread = new Thread(fruitTask);

        // Start thread execution
        fruitThread.start();
    }
}
