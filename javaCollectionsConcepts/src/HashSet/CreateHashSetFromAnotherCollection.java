package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class CreateHashSetFromAnotherCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Apple");
		
		System.out.println("Fruits in Hashset,printed as is" + fruits.toString());
		
		ArrayList<String> array = new ArrayList<>(fruits);
		
		System.out.println(fruits.contains("Aiiile"));
		
		System.out.println(array.get(1));
		
				
	}

}
