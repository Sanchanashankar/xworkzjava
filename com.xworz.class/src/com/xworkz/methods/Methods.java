package com.xworkz.methods;

public class Methods {
static	void add() { 
		
		
	System.out.println("Addition of two numbers");	
	}
	
	static void subtraction() {
		
		System.out.println("Subtraction of two numbers");
	}
	
	
	static void mul() {
		System.out.println("it is multiplication");
	}
	
	static void display() {
		add();
		subtraction();
		mul();
		System.out.println("display is working");
	}
	public static void main(String args[]) {
	display();
	}
}