package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class RetrieveLinkedListElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Orange");
		
		System.out.println("LinkedList "+fruits);
		
		//fruits.getFirst();
		//fruits.getLast();
		
		
		
		String orangeFruit = fruits.get(3);
		
		System.out.println("Orange fruit :"+orangeFruit);
		

//		//fruits.clear();
//		
//		System.out.println("After clear"+fruits);
	}

}
