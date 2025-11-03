package javaLambdaExpressions;
import java.util.function.Function;

public class FruitAndThenDemo {
    public static void main(String[] args) {

        Function<String, String> sliceBananas = (fruit) -> {
            if ("banana".equalsIgnoreCase(fruit)) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Slicing banana slice " + i + " 🍌...");
                    sleep();
                }
                System.out.println("✅ Finished slicing bananas\n");
            }
            return fruit;
        };

        Function<String, String> sliceApples = (fruit) -> {
            if ("apple".equalsIgnoreCase(fruit)) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Slicing apple slice " + i + " 🍎...");
                    sleep();
                }
                System.out.println("✅ Finished slicing apples");
            }
            return fruit;
        };

        Function<String, String> pipeline =
                sliceBananas.andThen(sliceApples);

        pipeline.apply("banana"); // will only slice bananas
        pipeline.apply("apple");  // will only slice apples
        pipeline.apply("orange"); // slices nothing
    }

    static void sleep() {
        try { Thread.sleep(1000); }
        catch (InterruptedException ignored) {}
    }
}
