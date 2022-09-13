package com.assignment.day1;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface RemoveUnmatchedItems{
	public List<String> returnMatchedString(String[] colours);
}


public class Color {

	public static void main(String[] args) {
		String[] color={"Black","Blue","Green"," ","d",null," ","e"};
		RemoveUnmatchedItems colorsStartingWithB=colorArray->{
			List<String> colors=new ArrayList<>();
			for(String col:color) {
				if(col!=null && col.startsWith("B")) {
					colors.add(col);
				}
			}
			return colors;
		};
		System.out.println(colorsStartingWithB.returnMatchedString(color));
	}

}
