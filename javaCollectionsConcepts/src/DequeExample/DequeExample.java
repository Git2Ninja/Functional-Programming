package DequeExample;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> fruits = new ArrayDeque<>();

        // Pushing items onto the "stack" (LIFO behavior)
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");
        fruits.push("Pinapple");

        System.out.println("Current Deque (as Stack): " + fruits);

        // Peek at the top element
        System.out.println("Top of the stack: " + fruits.peek());

        // Pop an item (removes top)
        String removed = fruits.pop();
        System.out.println("Popped: " + removed);

        System.out.println("Updated Deque (as Stack): " + fruits);

        // Manual search (no built-in search like Stack)
        String target = "Apple";
        int position = searchFromTop(fruits, target);
        System.out.println("Position of '" + target + "': " + (position == -1 ? "Not found" : position));

        // Check if empty
        System.out.println("Is the deque empty? " + fruits.isEmpty());
    }

    // Helper method to mimic Stack.search()
    private static int searchFromTop(Deque<String> deque, String target) {
        int index = 1;
        for (String item : deque) {
            if (item.equals(target)) {
                return index; // 1-based position from top
            }
            index++;
        }
        return -1; // Not found
    }
}
