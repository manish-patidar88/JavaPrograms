package com.java.prog.NumberProg;

public class factorial {

	public static void main(String[] args) {
		System.out.println(getFactorial(5));
		System.out.println(getFactorial(10));
	}
	public static int getFactorial(int num){
		 int i=1;
         while(num>0){
             i=i * num;
             num-=1;
         }
         return i;
	}

}
