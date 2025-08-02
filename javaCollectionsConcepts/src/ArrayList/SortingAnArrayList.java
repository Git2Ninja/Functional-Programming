package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		
		Collections.sort(list);
		System.out.println("Ascending order "+list);
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Descending Order"+list);
		
		list.sort((e1,e2)-> e1.compareTo(e2));
		
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Java");
		
		Collections.sort(programmingLanguages);
		System.out.println(programmingLanguages);
		Collections.sort(programmingLanguages,Comparator.reverseOrder());
		System.out.println(programmingLanguages);
	}
}
