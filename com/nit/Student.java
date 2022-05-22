package com.nit;

public class Student {
	private int roll;
	private String name;
	private String Address;
	private String collegeName;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public static Student getStudemt(boolean isFromNit) {
		Student d1 = new Student();
		if(isFromNit==true) {
			d1.collegeName = "NIT";
			return d1.collegeName;
		}
		
	}
}
