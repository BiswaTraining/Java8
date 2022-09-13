package com.assignment.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<String,List<Employee>> emp=empName->{
			List<Employee> empList = new ArrayList<Employee>();
			empList.add(new Employee(1, "Rohit", 34));
			empList.add(new Employee(2,"Rahul",29));
			empList.add(new Employee(3,"Virat",33));
			empList.add(new Employee(4,"Rishabh",24));
			empList.add(new Employee(5,"Rahul",33));
			
			List<Employee> response = new ArrayList<Employee>();
			for(int i=0;i<empList.size();i++) {
				if(empList.get(i).getName().equalsIgnoreCase(empName)) {
					response.add(empList.get(i));
				}
			}
			return response;
		};
		
		String empName="Rahul";
		if(emp.apply(empName)!=null && !emp.apply(empName).isEmpty()) {
			System.out.println("The employee with name "+empName+" are as below");
			System.out.println(emp.apply(empName));
		}
		else {
			System.out.println("No employee found by the name "+empName);
		}

	}

}
