package com.digit.javaTraining.oops;

public class EncapsulationGenericExample {
	public static void main(String[] args) {
		Cricketer c = new Cricketer();
		c.setData("S", "I", 100000000, 30);
		c.getData();

		System.out.println();

		Cricketer c1 = new Cricketer();
		c1.setName("Z");
		c1.setCountry("P");
		c1.setExp(1);
		c1.setRenumeration(1000);

		System.out.println(c1.getName());
		System.out.println(c1.getCountry());
		System.out.println(c1.getExp());
		System.out.println(c1.getRenumeration());
	}
}

class Cricketer {
	private String name;
	private String country;
	private int renumeration;
	private int exp;

	// generic setter
	void setData(String name, String country, int renumeration, int exp) {
		this.name = name;
		this.country = country;
		this.renumeration = renumeration;
		this.exp = exp;
	}

	// generic getter
	void getData() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(renumeration);
		System.out.println(exp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getRenumeration() {
		return renumeration;
	}

	public void setRenumeration(int renumeration) {
		this.renumeration = renumeration;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}