package HashSet;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CreateHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Apple");
		
		System.out.println("Fruits in Hashset" + fruits.toString());
		
		//iterate a hashset
		for(String fruit:fruits) {
			System.out.println(fruit.toString());	
		}
		
		
	}

}
