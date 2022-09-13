package com.assignment.day1;

import com.assignment.day1.interf.MyInterface1;
import com.assignment.day1.interf.MyInterface2;
import com.assignment.day1.interf.MyInterface3;

public class InterfaceImplementation implements MyInterface1,MyInterface2,MyInterface3{
	
	public int add(int x,int y) {
		MyInterface1.super.add(x, y);
		MyInterface2.super.add(x, y);
		MyInterface3.super.add(x, y);
		return x+y;
	}
	
	public static void main(String[] args) {
		InterfaceImplementation interfaceImplementation = new InterfaceImplementation();
		//Calling the method of the class where all the interface default methods were called
		System.out.println("Implementation class result: "+interfaceImplementation.add(10, 20));
	}

}
