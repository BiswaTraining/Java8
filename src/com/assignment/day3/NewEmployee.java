package com.assignment.day3;

public class NewEmployee {
	private int empId;
	private String empFirstName;
	private String empLastName;
	private String dept;
	private int age;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
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
	public NewEmployee(int empId, String empFirstName, String empLastName, String dept, int age, double salary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.dept = dept;
		this.age = age;
		this.salary = salary;
	}
	public NewEmployee() {
		super();
	}
	@Override
	public String toString() {
		return "NewEmployee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", dept=" + dept + ", age=" + age + ", salary=" + salary + "]";
	}
}
