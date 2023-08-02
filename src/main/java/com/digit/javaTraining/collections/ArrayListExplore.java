/**
 * 
 */
package com.digit.javaTraining.collections;

import java.util.ArrayList;

/**
 * @author Phaneendra.Kotha
 */
public class ArrayListExplore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();

		a1.add(100);
		a1.add(200);
		
		a2.addAll(a1);
		System.out.println(a2);

		a1.add(0, 300);

		a2 = (ArrayList) a1.clone();
		a2.clear();
		System.out.println("A2: " + a2);

		System.out.println(a1.contains(300));

		System.out.println("Capacity: " + a1.size());
		a1.ensureCapacity(20);
		System.out.println("Capacity: " + a1.size());

		System.out.println(a1.get(0));
		
		System.out.println(a1.toArray());
				
		System.out.println(a1.subList(0, 2));
		
		a1.remove(1);
		System.out.println(a1);
	}

}
