package com.assignment.day2;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		
		
		Supplier<String> emp=()->{
			int num=new Random().nextInt(999999);
			return String.format("%06d", num);
		};
		System.out.println("The otp is "+emp.get());
	}

}
