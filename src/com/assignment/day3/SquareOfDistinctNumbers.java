package com.assignment.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfDistinctNumbers {
	
		public static void main(String[] args) {
			List<Integer> numberList = new ArrayList<>();
			numberList.add(1);
			numberList.add(2);
			numberList.add(3);
			numberList.add(4);
			numberList.add(5);
			numberList.add(2);
			numberList.add(3);
			
			List<Integer> distinctSquares=numberList.stream().map(num->num*num).distinct().collect(Collectors.toList());
			if(distinctSquares!=null && !distinctSquares.isEmpty()) {
				System.out.println("Squares of distinct numbers are as below");
				for(Integer square:distinctSquares) {
					System.out.println(square);
				}
			}
		}
}
