package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessingElementsFromAnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if ArrayList empty
		
		//how to find size of a Array list
		
		//how to access the element at a particular index of an Array list using the get() method
		
		//how to modify the element at a particular index in an Array list using the set() method
		
		List<String> topCompanies = new ArrayList<>();
		System.out.println("Is the topCompanies list empty? :"+ topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");
		
		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
	}

}
