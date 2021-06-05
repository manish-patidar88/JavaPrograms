package com.java.prog.stringIntegerChar;

public class Swipe2IntegerWithOutUsingExtraVar {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		a=a+b;  //5
		b=a-b;  //2
		a=a-b;
		
		System.out.println("a :"+ a + " b :"+ b);
	}
}
