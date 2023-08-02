package com.digit.javaTraining.multiThreading;

class Gender extends Thread {
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

public class MultiThreadDisAdv {
	public static void main(String[] args) {
		Gender g1 = new Gender();
		g1.setName("Boy");
		Gender g2 = new Gender();
		g2.setName("Girl");
		Gender g3 = new Gender();
		g3.setName("Other");
		
		g1.start();
		g2.start();
		g3.start();
	}
}
