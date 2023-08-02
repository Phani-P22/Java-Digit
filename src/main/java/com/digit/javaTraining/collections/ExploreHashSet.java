package com.digit.javaTraining.collections;

import java.util.HashSet;
import java.util.Iterator;

public class ExploreHashSet {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(25);
		hs.add(30);
		hs.add(55);
		hs.add(25);
		hs.add(80);
		System.out.println(hs);

		System.out.println(hs.contains(25));
		
		System.out.println(hs.isEmpty());
		
		hs.remove(25);
		
		System.out.println(hs.contains(25));
		
		System.out.println(hs.size());
		
		System.out.println(hs.toArray());
		
		
	}
}
