package ArrayList;

import java.util.*;

public class javaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
	
		animals.add("bird");
		
		
		
		System.out.println(animals);
		
		animals.add(1, "tiger");
		
		System.out.println(animals);

	}

}
