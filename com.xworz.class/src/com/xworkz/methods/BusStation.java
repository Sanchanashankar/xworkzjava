package com.xworkz.methods;

class BusStation {
	static String source;
	static String destination;
	static int ticketPrice;

	public static void source() {
		source = "Mysore";

	}

	public static void destination() {
		destination = "Manglore";
	}

	public static void ticket() {
		ticketPrice = 250;
		System.out.println(ticketPrice);

	}

	static void display() {
		source();
		destination();
		ticket();
		System.out.println(source);
		System.out.println(destination);
		System.out.println(ticketPrice);

	}

	public static void main(String bus[]) {
		source();
		destination();
		ticket();
		display();
		System.out.println(ticketPrice);
	}
}