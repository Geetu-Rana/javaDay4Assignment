package com.sudentdetail;

public class Student {
	 private int roll;
	 private String name;
	 private int age;
	 private int marks;
	 
	 public int getRoll() {
		 return this.roll;
	 }
	 public void setRoll(int roll) {
		 this.roll = roll;
	 }
	 public String getName() {
		 return this.name;
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return this.age;
	 }
	 public void setAge(int age) {
		 if(age>18 & age<60) {
			 this.age = age;
		 }else {
			 System.out.println("Invalid age");
		 }
	 }
	 
	 public int getMarks() {
		 return this.marks;
	 }
	 public void setMarks(int marks) {
		this.marks = marks;
	 }

	 public Student(int roll, String name, int age, int marks) {
		 this.roll = roll;
		 this.name = name;
		 this.age = age;
		 this.marks= marks;
	 }
	 public Student() {
		 
	 }
	 public void showDetails() {
		 System.out.println("Roll is :"+roll); 
		 System.out.println("Name is :"+name); 
		 if(age>18 && age<60) {
		 System.out.println("Age is :"+age);
		 }else {
			 System.out.println("Age must be greater than 18 or less than 60 ");
		 }
		 if(marks>0 && marks<500) {
			 System.out.println("Marks is :"+marks);
		 }else {
			 System.out.println("Ivalid marks");
		 }
	 }
}
