package com.java.prog.other;

public class PrintNoWithoutLoops {
	public static void main(String[] args) {
		printNo(1,10);
	}
	
	public static void printNo(int start,int end) {
		if(start<=end) {
			System.out.println(start);
			start++;
			printNo(start,end);						
		}	
	}

}
