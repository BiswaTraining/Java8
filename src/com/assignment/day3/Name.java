package com.assignment.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Name {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rohit", "Developer", 34, 50000));
		empList.add(new Employee(2, "Rahul", "Developer", 29, 50000));
		empList.add(new Employee(3, "Virat", "QA", 33, 50000));
		empList.add(new Employee(4, "Rishabh", "QA", 24, 50000));
		empList.add(new Employee(5, "Surya", "Developer", 33, 50000));
		empList.add(new Employee(6, "Hardik", "Developer", 27, 50000));
		empList.add(new Employee(7, "Jadeja", "QA", 30, 50000));
		empList.add(new Employee(8, "Sundar", "QA", 26, 50000));
		
		String text="Sun";
		
		List<Employee> empl=empList.stream().filter(emp->emp.getEmpName().contains(text)).collect(Collectors.toList());
		
		if(empl!=null && !empl.isEmpty()) {
			for(Employee employee:empl) {
				System.out.println(employee);
			}
		}else {
			System.out.println("No employee found with name: "+text);
		}

	}

}
