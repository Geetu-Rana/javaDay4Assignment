package com.oddEven;

public class OddEven {
	
	public static void  oddEven(int num) {
		if(num<0) {
			System.out.println("error");
			return;
		}
		if(num%2!=0) {
			System.out.println(num);
			return;
		}
		else{
			num = (num+9)-(num+9)%10;
			System.out.println(num);
			return;
		}
	}
	public static void main(String[] args) {
		
		int N = 44;
		int M = 45;
		int O = -5;
		oddEven(N);
		oddEven(M);
		oddEven(O);
	}
	
}
