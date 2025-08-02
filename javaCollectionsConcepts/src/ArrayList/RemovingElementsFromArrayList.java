package ArrayList;

import java.util.ArrayList;
import java.util.List;


public class RemovingElementsFromArrayList {

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
		
		System.out.println(programmingLanguages);
		
		String removed = programmingLanguages.remove(5);
		
		
		
		System.out.println("removed item at index 5 "+removed);
		
		System.out.println(programmingLanguages);
		
		Boolean removedObject = programmingLanguages.remove("Kotlin");
		
		System.out.println("Removed Kotlin? :"+removedObject);
		
		System.out.println(programmingLanguages);
		
		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");
		
		boolean isRemovedAll = programmingLanguages.removeAll(scriptingLanguages);
		
		System.out.println(isRemovedAll);
		
		
		//System.out.println(programmingLanguages);
		
		//predicate functional interface
		programmingLanguages.removeIf(element -> element.startsWith("C"));
		
		System.out.println(programmingLanguages);
	}

}
