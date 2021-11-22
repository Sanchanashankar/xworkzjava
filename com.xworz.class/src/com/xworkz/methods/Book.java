package com.xworkz.methods;

public class Book {
	static String title, authorName, publishingHouse, price;

		public static void main (String args[]) {
	release(args[0], args[1], args[2], args[3]);
	display();
	}

	static void release(String t, String an, String ph, String args)
	{

	title="t";
	authorName="an";
	publishingHouse="ph";
	price="pr";
	}

	static void display(){
	System.out.println("Book title:" +title+ "\n AuthorName:" +authorName+ "\n publishingHouse:" +publishingHouse+ "price of the book is:" +price);

	}


}
