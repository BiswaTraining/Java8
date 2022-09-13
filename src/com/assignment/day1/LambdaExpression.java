package com.assignment.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpression {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Rohit", 33, "Batsman"));
		emp.add(new Employee("Rahul", 29, "Batsman"));
		emp.add(new Employee("Virat",34, "Batsman"));
		emp.add(new Employee("Rishabh", 24, "WicketKeeper"));
		
//		Collections.sort(emp,new IdComparator());
//		System.out.println(emp);
		Collections.sort(emp,(Employee o1, Employee o2)->o1.getAge()-o2.getAge());	
		System.out.println(emp);		
	}
}
