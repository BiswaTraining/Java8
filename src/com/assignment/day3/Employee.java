package com.assignment.day3;

public class Employee {
	private int empId;
	private String empName;
	private String dept;
	private int age;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, String dept, int age, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + ", age=" + age + ", salary="
				+ salary + "]";
	}
}
