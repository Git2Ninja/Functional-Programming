package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RemovingElementsFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Orange");
		
		fruits.remove(3);
		System.out.println("After removing element at index 3"+fruits);
		//fruits.removeFirst();
		//fruits.removeLast();
		fruits.removeIf((fruit) -> fruit.startsWith("C"));
		
		System.out.println("After remove if "+fruits);
		
		fruits.clear();
		
		System.out.println("After clear "+fruits);
		
//		
	}

}
