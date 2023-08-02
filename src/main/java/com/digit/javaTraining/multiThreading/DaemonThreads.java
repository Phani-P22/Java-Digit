package com.digit.javaTraining.multiThreading;

class MSOffice extends Thread {
	public void run() {
		if (Thread.currentThread().getName().equals("typing")) {
			typing();
		} else if (Thread.currentThread().getName().equals("checking")) {
			checking();
		} else {
			saving();
		}
	}

	void saving() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Saving");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void checking() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Checking");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void typing() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Typing");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreads {
	public static void main(String[] args) {
		MSOffice ms1 = new MSOffice();
		ms1.setName("typing");
		MSOffice ms2 = new MSOffice();
		ms2.setName("checking");
		MSOffice ms3 = new MSOffice();
		ms3.setName("saving");
		
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		ms1.start();
		ms2.start();
		ms3.start();
	}
}
