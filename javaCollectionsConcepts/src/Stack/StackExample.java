package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();

        // Pushing items onto the stack
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");

        System.out.println("Current Stack: " + fruits);

        // Peek at the top element
        System.out.println("Top of the stack: " + fruits.peek());

        // Pop an item (removes top)
        String removed = fruits.pop();
        System.out.println("Popped: " + removed);

        System.out.println("Updated Stack: " + fruits);

        // Search (1-based from top)
        System.out.println("Position of 'Apple': " + fruits.search("Apple"));

        // Check if empty
        System.out.println("Is the stack empty? " + fruits.empty());
    }
}

