package javaLambdaExpressions;

import java.util.function.Function;

public class FruitComposeDemo {

    public static void main(String[] args) {

        // Function to slice fruit (runs SECOND because compose reverses order)
        Function<String, String> sliceFruit = (fruit) -> {
            System.out.println("🔪 Slicing the " + fruit + "...");
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Slice " + i + " of " + fruit);
                    Thread.sleep(1000); // simulate work delay
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("✅ Finished slicing " + fruit + "\n");
            return fruit;
        };

        // Function to wash fruit (runs FIRST due to compose)
        Function<String, String> washFruit = (fruit) -> {
            System.out.println("💧 Washing the " + fruit + "...");
            try {
                Thread.sleep(1000); // simulate washing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("🧼 Finished washing " + fruit);
            return fruit;
        };

        /*
         * compose = run the argument function FIRST,
         * then run the current function.
         *
         * So this pipeline = wash fruit → slice fruit
         */
        Function<String, String> fruitPipeline = sliceFruit.compose(washFruit);

        // Start pipeline — the string decides which fruit is processed
        fruitPipeline.apply("apple");
        fruitPipeline.apply("banana");
    }
}
