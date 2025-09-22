package LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        // Add some key-value pairs (insertion order is maintained)
        linkedHashMap.put(4, "Four");
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
    
        
        // Display the LinkedHashMap (order will be insertion order)
        System.out.println("LinkedHashMap (Insertion Order):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Access a value (this can optionally affect access order if enabled)
        linkedHashMap.get(2); // Access the key '2'

        // Create a new LinkedHashMap with access order enabled
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put(1, "One");
        accessOrderMap.put(3, "Three");
        accessOrderMap.put(2, "Two");
        accessOrderMap.put(4, "Four");
        
        // Display the LinkedHashMap (this will show elements ordered by access)
        System.out.println("\nLinkedHashMap (Access Order after accessing keys):");
        accessOrderMap.get(1); // Access the key '2'
        accessOrderMap.get(4); // Access the key '4'
        
        // The order should now reflect the most recently accessed keys
        for (Map.Entry<Integer, String> entry : accessOrderMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
