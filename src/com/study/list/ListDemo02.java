package com.study.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo02 {

	public static void main(String[] args) {
		Set<String> s = null;
		s = new HashSet<String>();
		s.add("B");
		s.add("A");
		s.add("D");
		s.add("E");
		s.add("C");
		s.add("G");
		s.add("F");

		
		System.out.println(s);
		
		Set<String> s1 = null;
		s1 = new TreeSet<String>();
		s1.add("D");
		s1.add("E");
		
		s1.add("F");
		s1.add("A");

	
		System.out.println(s1);
		
	}

}
