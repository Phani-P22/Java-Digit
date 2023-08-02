package com.digit.javaTraining.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
	String name;
	String country;
	int age;
	int matches;
	int wickets;

	public Cricketer(String name, String country, int age, int matches, int wickets) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
		this.matches = matches;
		this.wickets = wickets;
	}

	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(age);
		System.out.println(matches);
		System.out.println(wickets);
	}

}

public class SerializationExample {
	public static void main(String[] args) {
		Cricketer c = new Cricketer("A", "B", 0, 0, 0);
		c.display();

		try {
			FileOutputStream fo = new FileOutputStream("C:\\Users\\phaneendra.kotha\\Desktop\\Input.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fo);
			oos.writeObject(c);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Deserialization: ");
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\phaneendra.kotha\\Desktop\\Input.txt");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Cricketer cc = (Cricketer) ois.readObject();
			cc.display();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
