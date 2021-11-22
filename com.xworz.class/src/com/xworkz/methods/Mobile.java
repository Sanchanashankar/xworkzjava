package com.xworkz.methods;

public class Mobile {

static String Name,  brandName, ram, camera, price;


public static void main(String args[]){

release(args[0], args[1], args[2], args[3], args[4]);
display();
}

static void release(String N, String bn, String r, String  cam, String p)
{
Name=N;
brandName=bn;
ram=r;
camera=cam;
price=p;
}
static void display(){
System.out.println("Name of phone:" +Name+ "\n Brand:" +brandName+ "\n Ram is:" +ram+ "\n camera:" +camera+ "\n cost is:" +price);

}

}
