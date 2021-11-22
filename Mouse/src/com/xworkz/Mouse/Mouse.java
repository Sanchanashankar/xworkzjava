package com.xworkz.Mouse;

public class Mouse {
	public Mouse() {
		this("normal type");
		System.out.println("default constructor");
	}
public Mouse(String type) {
	this("red",250.60);
	System.out.println("Typeof mouse " +type);
}
public Mouse(String colour, double price) {
	this(true,true,true);
	System.out.println("colour of the mouse " +colour+ "cost of the mouse " +price);
}
public Mouse(boolean drag, boolean click,  boolean select) {
	System.out.println("we can drag "+drag+ "we can click " +click+ "we can select" +select );
}
}
