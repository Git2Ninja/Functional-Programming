package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SeacrhingForElementsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Java");
		
		//Check if an ArrayList contains 
		boolean hasElement = programmingLanguages.contains("Java");
		System.out.println(hasElement);
		
		
		int index = programmingLanguages.indexOf("Java");
		System.out.println("Java element present at index: "+index);
		
		int lastIndex = programmingLanguages.lastIndexOf("Java");
		
		System.out.println("Java element present at last index "+lastIndex);
	}

}
