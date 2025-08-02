package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String email;


public Employee(int id,String firstName,String lastName,String email) {
	this.id=id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
    }


@Override
public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
}
	
	
}


public class ArrayListOfUserDefinedObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee> employees = new ArrayList<>();	
		employees.add(new Employee(1,"Ramesh","Smith","whatwhat@gmail.com"));
		employees.add(new Employee(1,"Patrcik","George","whatwhat2@gmail.com"));
		employees.add(new Employee(1,"Patrick","Starfish","whatwhat3@gmail.com"));
		
		employees.forEach((employee)->{System.out.println(employee.toString());
		
		});
	}
}