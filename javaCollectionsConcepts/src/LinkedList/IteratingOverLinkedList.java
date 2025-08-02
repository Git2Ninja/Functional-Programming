package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratingOverLinkedList {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		//fruits.add("Orange");
		
		System.out.println("LinkedList: "+fruits);
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator<String> stringIterator = fruits.iterator();
		stringIterator.forEachRemaining(fruit -> System.out.println(fruit));
		
		System.out.println();
		
		Iterator<String> descendingIterator = fruits.descendingIterator();
		while(descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}
		
		fruits.forEach(fruit -> System.out.println(fruit));
	}

}
