package com.assignment.day3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SalaryOperations {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, "Rohit", "Developer", 34, 50000));
		empList.add(new Employee(2, "Rahul", "Developer", 29, 51000));
		empList.add(new Employee(3, "Virat", "QA", 33, 52000));
		empList.add(new Employee(4, "Rishabh", "QA", 24, 53000));
		empList.add(new Employee(5, "Surya", "Developer", 33, 45000));
		empList.add(new Employee(6, "Hardik", "Developer", 27, 60000));
		empList.add(new Employee(7, "Jadeja", "QA", 30, 50000));
		
		Long countOfEmployees = empList.stream().count();
		System.out.println("Count of employees: "+countOfEmployees);
		
		Optional<Employee> minimumSalary =empList.stream().min((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary()));
		
		if(minimumSalary!=null && minimumSalary.isPresent()) {
			System.out.println("Minimum salary is: "+minimumSalary.get().getSalary());
		}
		
		Optional<Employee> maximumSalary =empList.stream().max((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary()));
		
		if(maximumSalary!=null && maximumSalary.isPresent()) {
			System.out.println("Maximum salary is: "+maximumSalary.get().getSalary());
		}
		
		Double sumOfSalary = empList.stream().mapToDouble(emp->emp.getSalary()).sum();
		
		if(sumOfSalary!=null) {
			System.out.println("Sum total of all salary is: "+sumOfSalary);
		}
		
		OptionalDouble avgOfSalary = empList.stream().mapToDouble(emp->emp.getSalary()).average();
		
		if(avgOfSalary!=null) {
			System.out.println("Average of all salary is: "+avgOfSalary.getAsDouble());
		}

	}

}
