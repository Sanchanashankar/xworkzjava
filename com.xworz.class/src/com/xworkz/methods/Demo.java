package com.xworkz.methods;

class Demo {
	static String writerName, songName, notes, type, language;

	public static void main(String args[]) {
		System.out.println("inside main");

		release(args[0], args[1], args[2], args[3], args[4]);
		display();
		System.out.println("outside main");
	}

	static void release(String wn, String sn, String n, String t, String lan) {

		writerName = wn;
		songName = sn;
		notes = n;
		type = t;
		language = lan;
	}

	static void display() {
		System.out.println("New song writer name:" + writerName + "\n song title:" + songName + "\n notes of song:"
				+ notes + "\n type:" + type + "\n language:" + language);
	}

}