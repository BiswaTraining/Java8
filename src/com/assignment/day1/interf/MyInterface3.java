package com.assignment.day1.interf;

public interface MyInterface3 {
	default int add(int x,int y) {
		System.out.println("MyInterface3 method getting called");
		int sum=x+y;
		System.out.println("The sum is: "+sum);
		return sum;
	}
}
