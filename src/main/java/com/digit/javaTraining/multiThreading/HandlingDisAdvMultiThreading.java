package com.digit.javaTraining.multiThreading;

class Genders extends Thread {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " entered the Bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName() + " is using the Bathroom");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName() + " has left the Bathroom");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class HandlingDisAdvMultiThreading {
	public static void main(String[] args) throws InterruptedException {
		Genders g1 = new Genders();
		g1.setName("Boy");
		Genders g2 = new Genders();
		g2.setName("Girl");
		Genders g3 = new Genders();
		g3.setName("Other");

		g1.start();
		g1.join();
		g2.start();
		g2.join();
		g3.start();
	}
}
