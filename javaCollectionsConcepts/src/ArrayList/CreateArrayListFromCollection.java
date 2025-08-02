package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
	public static void main(String[] args) {
		List <Integer> myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		List <Integer> myList2 = new ArrayList<>();
		myList2.add(5);
		myList2.add(6);
		myList2.add(7);
		myList2.add(8);
		
		List <Integer> myList3 = new ArrayList<>(myList);
		//myList3.addAll(myList2);
		
		System.out.println(myList3);
		
	}
}
