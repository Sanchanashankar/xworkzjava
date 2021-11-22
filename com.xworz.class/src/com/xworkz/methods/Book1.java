package com.xworkz.methods;

public class Book1 {
	static String title, authorName,publishingHouse;
	static int price;
	static void autobiography() {
		title="Wings of fire";
		authorName="APJ Abdul Kalam";
		publishingHouse="Subash publishing";
		price=300;
		display();
			}
	
	static void mythology() {
	title="Believe in yourself";
	authorName="Swami Vivekananda";
	publishingHouse="ALEPH";
	price=270;
	
	}

	static void display() {
		
		System.out.println("config: Title: " +title+ "\n Author Name: " +authorName+ "Published by:" +publishingHouse+ "\n Price of the book is:" +price );
		
	}
	
	public static void main(String args[]) {
		autobiography();
	}
}
