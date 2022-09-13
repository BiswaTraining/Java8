package com.assignment.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		String role="Developer";
		List<NewEmployee> emp = new ArrayList<NewEmployee>();
		emp.add(new NewEmployee("Rohit", "Developer"));
		emp.add(new NewEmployee("Rahul","Developer"));
		emp.add(new NewEmployee("Virat","QA"));
		emp.add(new NewEmployee("Rishabh","BA"));
		
		Predicate<NewEmployee> empl = employee->employee.getRole().equalsIgnoreCase(role);
		List<String> listOfEmployees = new ArrayList<>();
		for(NewEmployee employees:emp) {
			if(empl.test(employees)) {
				listOfEmployees.add(employees.getName());
			}
		}
		
		if(listOfEmployees!=null && !listOfEmployees.isEmpty()) {
			System.out.println(listOfEmployees);
		}else {
			System.out.println("No employee found for the role: "+role);
		}

	}

}
