package com.assignment.day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxAge {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rohit", "Developer", 34, 50000));
		empList.add(new Employee(2, "Rahul", "Developer", 29, 50000));
		empList.add(new Employee(3, "Virat", "QA", 33, 50000));
		empList.add(new Employee(4, "Rishabh", "QA", 24, 50000));
		empList.add(new Employee(5, "Surya", "Developer", 33, 50000));
		empList.add(new Employee(6, "Hardik", "Developer", 27, 50000));
		empList.add(new Employee(7, "Jadeja", "QA", 30, 50000));
		
		Optional<Employee> emp=empList.stream().max((emp1,emp2)->emp1.getAge()-emp2.getAge());
		if(emp!=null && emp.isPresent()) {
			System.out.println(emp.get());
		}

	}

}
