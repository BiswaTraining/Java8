package com.assignment.day1;

public class ThreadExecution {

	public static void main(String[] args) {
		Runnable t = ()->System.out.println("My thread implementation");
		t.run();

	}

}
