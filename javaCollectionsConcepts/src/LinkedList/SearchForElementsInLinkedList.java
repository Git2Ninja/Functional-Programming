package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class SearchForElementsInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Orange");
		
		System.out.println("LinkedList: "+fruits);
		
		boolean containsBanana = fruits.contains("Banana");
		System.out.println("After contains()" + containsBanana);
		
		fruits.lastIndexOf("Orange");
	}

}
