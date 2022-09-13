package com.assignment.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Rohit", 34));
		empList.add(new Employee(2,"Rahul",29));
		empList.add(new Employee(3,"Virat",33));
		empList.add(new Employee(4,"Rishabh",24));
		empList.add(new Employee(5,"Surya",33));
		
		Consumer<Employee> emp=empl->System.out.println(empl.getId()+" "+empl.getName()+" "+empl.getAge());
		for(Employee employee:empList) {
			emp.accept(employee);
		}

	}

}
