package com.sudentdetail;

public class Main {
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setRoll(101);
		student1.setName("Pankaj");
		student1.setAge(16);
		student1.setMarks(600);
		
		System.out.println("Student 1 Details :");
		student1.showDetails();
		Student student2 = new Student(102,"Geetu",23, 400);
		
		System.out.println("Student 2 Details :");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName()); 
		 if(student2.getAge()>18 && student2.getAge()<60) {
			 System.out.println("Marks is :"+student2.getAge());
			 }else {
				 System.out.println("Age must be greater than 18 or less than 60 ");
			 }
			 if(student2.getMarks()>0 && student2.getMarks()<500) {
				 System.out.println("Marks is :"+student2.getMarks());
			 }else {
				 System.out.println("Ivalid marks");
			 }

	}
}
