package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();
		emp.addAll(Arrays.asList(new Employee("tej", 2), new Employee("Anuj", 3), new Employee("Anish", 4)));
		System.out.println(emp);
		
//		Comparator<Employee> em = new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		};
//		Collections.sort(emp, em);

		//method 2
//		Collections.sort(emp,new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
	
		//method 3
		Collections.sort(emp,(Employee e1,Employee e2) -> e1.getName().compareTo(e2.getName()));
				
		
		System.out.println(emp);

	}

}
