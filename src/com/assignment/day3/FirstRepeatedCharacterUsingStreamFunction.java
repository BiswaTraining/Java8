package com.assignment.day3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterUsingStreamFunction {

	public static void main(String[] args) {
		String testString = "Welcome to CitiusTech"; 
		Map<Character,Long> map=testString.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		Entry<Character, Long> c = map.entrySet().stream().filter(entry->entry.getValue()>1L).findFirst().get();
		if(c!=null) {
			System.out.println("First repeated character is "+c.getKey());
		}

	}

}
