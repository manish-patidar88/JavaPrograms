package com.java.prog.stringIntegerChar;

import java.util.ArrayList;

public class ReverseInteger {

	public static void main(String[] args) {
		//reverseIntger(123456789);
		//reverseIntegers(123456789);
		System.out.println(revInteger(123456789));
	}
	public static int revInteger(int num) {
        int temp=num;
        String revNum="";
        while(temp>0){
            revNum=revNum + temp%10;
            temp/=10;            
        }
		return Integer.parseInt(revNum);
	}
	public static void reverseIntger(int i) {
		String strArray[]= Integer.toString(i).split("");
		String str ="";
		for(String s:strArray) {
			str = s+ str ;
		}		
		System.out.println(Integer.parseInt(str));
	}
	
	public static void reverseIntegers(int i) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int temp = i;
		while (temp>0) {
			al.add(temp %10);
			temp/=10;
		}
		
		for(Integer num :al) {
			System.out.print(num);
		}
			
	}

	public static int sumIntegers(int i) {		
		
         String str[] =Integer.toString(i).split("");
         int sum =0;
         for(int j=0;j<str.length;j++){
             sum=sum+Integer.parseInt(str[j]);
         }
         
     return sum;
		
	}
}
