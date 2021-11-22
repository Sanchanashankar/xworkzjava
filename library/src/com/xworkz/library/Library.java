package com.xworkz.library;

public class Library {
	public Library() {
		this("Public library");
		System.out.println("default constructors");
	}
public Library( String type) {
	this("Banglore", "city central library", 10);
	System.out.println("type of library:" +type);
}
public Library(String location, String name, int noOfLibrarians) {
	this(true, true, true);
	System.out.println("Library is at: " +location+  " Name of the library: " +name+ " number of librarians: " +noOfLibrarians);
}
public Library(boolean HistoricalInfo, boolean books, boolean learning) {
	System.out.println("getting information about history:" +HistoricalInfo+ "books are the major reason to visit library:" +books+ "libraries are ment for learning:" +learning);
}
}
