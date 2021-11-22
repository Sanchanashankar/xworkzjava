package com.xworkz.methods;

public class Work {
	public class VoidExample {
		 
	    public static void main(String[] args) {
	        voidMethod();
	        String returnedString = returningMethod();
	        System.out.println(returnedString);
	    }
	 
	    public static void voidMethod() {
	        System.out.println("voidMethod is called");
	    }
	 
	    public static String returningMethod() {
	        return "returningMethod is called";
	    }
	}

}
