package com.assignment.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CaseConversion {

	public static void main(String[] args) {
		List<NewEmployee> empList=new ArrayList<NewEmployee>();
		empList.add(new NewEmployee(1, "Rohit","Sharma", "Developer", 34, 50000));
		empList.add(new NewEmployee(2, "Lokesh","Rahul" ,"Developer", 29, 50000));
		empList.add(new NewEmployee(3, "Virat","Kohli", "QA", 33, 50000));
		empList.add(new NewEmployee(4, "Rishabh","Pant", "QA", 24, 50000));
		empList.add(new NewEmployee(5, "Surya","Kumar Yadav", "Developer", 33, 50000));
		empList.add(new NewEmployee(6, "Hardik","Pandya", "Developer", 27, 50000));
		empList.add(new NewEmployee(7, "Ravindra","Jadeja", "QA", 30, 50000));
		empList.add(new NewEmployee(8, "Washington","Sundar", "QA", 26, 50000));
		
		
		List<String> concatenatedEmployeeNameList = empList.stream().map(emp->emp.getEmpFirstName().toUpperCase()+","+emp.getEmpLastName().toUpperCase()).collect(Collectors.toList());
		if(concatenatedEmployeeNameList!=null && !concatenatedEmployeeNameList.isEmpty()) {
			for(String empName:concatenatedEmployeeNameList) {
				System.out.println(empName);
			}
		}
	}
		
		

}
