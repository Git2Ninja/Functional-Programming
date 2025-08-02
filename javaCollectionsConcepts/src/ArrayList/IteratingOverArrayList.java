package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayList {

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
		System.out.println("For Loop");
		for(int i=0;i < programmingLanguages.size();i++) {
			System.out.println(programmingLanguages.get(i));
		}
		System.out.println("For Each");
		for(String language: programmingLanguages) {
			System.out.println(language);
		}
		System.out.println("Iterator");
		Iterator<String> iterator = programmingLanguages.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Iterator forEachRemainingMethod");
		programmingLanguages.iterator().forEachRemaining((element)->{
			System.out.println(element);
		});
		System.out.println("Java 8 forEach and lambda");
		programmingLanguages.forEach(element -> {System.out.println(element);
		});
	}
}