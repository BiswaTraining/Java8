package com.assignment.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AgeFilter {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rohit", "Developer", 34, 50000));
		empList.add(new Employee(2, "Rahul", "Developer", 29, 50000));
		empList.add(new Employee(3, "Virat", "QA", 33, 50000));
		empList.add(new Employee(4, "Rishabh", "QA", 24, 50000));
		empList.add(new Employee(5, "Surya", "Developer", 33, 50000));
		empList.add(new Employee(6, "Hardik", "Developer", 27, 50000));
		empList.add(new Employee(7, "Jadeja", "QA", 30, 50000));
		empList.add(new Employee(8, "Umran", "QA", 18, 50000));
		
		List<Employee> ageGreaterThan20=empList.stream().filter(emp->emp.getAge()>20).collect(Collectors.toList());
		if(ageGreaterThan20!=null && !ageGreaterThan20.isEmpty()) {
			System.out.println("All employees above 20 years of age are as below:");
			for(Employee empl:ageGreaterThan20) {
				System.out.println(empl.getEmpName());
			}
		}

	}

}
