package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class CreateTreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will be ignored

        // Displaying the TreeSet (automatically sorted)
        System.out.println("Fruits TreeSet: " + fruits);

        // Iterating through TreeSet
        System.out.println("Iterating over TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Iterating over TreeSet: Using Iterator");
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        System.out.println("Iterating over TreeSet: Using Lambda expression");
        fruits.iterator().forEachRemaining((fruit) -> System.out.println(fruit));

        // Checking for existence
        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the TreeSet.");
        }

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Getting first and last elements
        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());
    }
}
