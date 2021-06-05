package com.java.prog.NumberProg;

import java.util.ArrayList;

public class fibonaciSeries {

	public static void main(String[] args) {
		System.out.println(getFibonacii(10));
	}

	//Logic
  /*1 1 2 3 5 8 13
	a+b=c
	  a+b=c
	    a+b=c
  ----------------
	  a=b
	  b=c*/		  
	
	private static ArrayList<Integer> getFibonacii(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int a= 1;
		int b=1;
		int i=1;
		int c=0;
		while(i<n){
			a=b;
			b=c;
			c=a+b;
			al.add(c);
			i++;
		}
		return al;
	}
}
