package com.assignment.day1;

@FunctionalInterface
interface SumInterface{
	int sumOfTwoNumbers(int x, int y);
}

public class Sum {

	public static void main(String[] args) {
		SumInterface sum = (a,b)->a+b;
		System.out.println(sum.sumOfTwoNumbers(10, 20));

	}

}
