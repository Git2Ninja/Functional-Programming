package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class FruitInventory {
    public static void main(String[] args) {
        // Create a TreeMap to store fruit names and their quantities
        TreeMap<String, Integer> fruitInventory = new TreeMap<>();

        // Add some fruits to the inventory
        fruitInventory.put("Apple", 50);
        fruitInventory.put("Banana", 30);
        fruitInventory.put("Mango", 20);
        fruitInventory.put("Orange", 40);
        fruitInventory.put("Grapes", 25);

        // Display the inventory (sorted by fruit name)
        System.out.println("Fruit Inventory (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : fruitInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }

        // Check the quantity of a specific fruit
        System.out.println("\nQuantity of Mango: " + fruitInventory.get("Mango"));

        // Remove a fruit from the inventory
        fruitInventory.remove("Banana");

        // Display the updated inventory
        System.out.println("\nInventory after removing Banana:");
        for (Map.Entry<String, Integer> entry : fruitInventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }
}
