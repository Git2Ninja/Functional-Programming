package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {

	public static void main(String[] args) {

		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		
		
		System.out.println("LinkedList after add() "+fruits);
		
		fruits.add(1, "Mango");
		
		System.out.println("LinkedList after add(index ,element) "+fruits);
		
		//fruits.addFirst();
		
		//fruits.addLast();
		
		List<String> moreFruits = new LinkedList<>();
		moreFruits.add("Orange");
		moreFruits.add("Watermelon");
		
		fruits.addAll(moreFruits);
		System.out.println("Linkedlist after addAll();"+fruits);
	}

}
