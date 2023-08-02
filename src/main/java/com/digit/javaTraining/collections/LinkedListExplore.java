package com.digit.javaTraining.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExplore {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.add(100);
		ll.add(200);
		ll.add(300);

		System.out.println(ll);

		ll.add(1, 150);

		System.out.println(ll);

		ll.addFirst(50);

		System.out.println(ll);

		ll.addLast(350);

		System.out.println(ll);

		LinkedList l = (LinkedList) ll.clone();

		System.out.println("L: " + l);
		l.clear();
		System.out.println("L: " + l);

		System.out.println(ll.contains(350));

		ll.add(50);
		ll.add(150);
		System.out.println(ll.containsAll(l));

		System.out.println(ll.element());
		System.out.println(ll);
		
		
	}
}
