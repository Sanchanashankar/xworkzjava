package com.xworkz.house;

public class House {
public House() {
	this(4);
	System.out.println("default constructor");
}
public House(int members) {
	this("shankar", "renuka");
	System.out.println("Members:" +members);
}
public House(String fatherName, String motherName) {
	this(3, "Harish" , "Sanchana");
System.out.println("Father Name:" +fatherName+ "Mother Name:" +motherName); 
}
public House(int noOfRooms, String brotherName, String sisterName) {
	System.out.println("Rooms:" +noOfRooms+  "Brother Name:"  +brotherName+  "Sister Name:" +sisterName);
}
}
