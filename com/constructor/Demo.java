package com.constructor;

public class Demo {
	public Demo() {
		this(10);
		System.out.println("Zero Argument constructor Demo()");
	}
	public Demo(String S) {
		//this("hello");
		System.out.println("inside String One (String) argument constructor demo(String S)");
		
	}
	public Demo(float f) {
		
		System.out.println("Hello");
	}
	
	public Demo(int i) {
		this("hello");
		System.out.println("Inside one argumennt cuntructor Demo(int num) ");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		
	}
}
