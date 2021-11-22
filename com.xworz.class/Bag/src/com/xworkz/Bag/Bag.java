package com.xworkz.Bag;

public class Bag {
	public Bag() {
		this(1890.78);
		System.out.println("all about bag details");
	}
	public Bag(double cost) {
		this("Blue", "carry bag");
		System.out.println("Price of the bag:" +cost);
	}
	public Bag(String colour, String type) {
		this(true, true, true, true);
		System.out.println("Colour: " +colour+  "\n Type:" +type);
	}
	public Bag(boolean use, boolean stylish, boolean lightWeight, boolean manage) {
		this("wildCraft", true, 14);
		System.out.println("Easy to carry:" +use+ "\n Looks stylish:" +stylish+ "\n Lighter in weight:" +lightWeight+ "\n Easy to manage:" +manage);
	}
	public Bag(String name, boolean waterProof, int length) {
		System.out.println("Brand Name: " +name+  "\n Waterproof bag:" +waterProof+ "\n Length of the bag :" +length+ "inch");
	}
	}
