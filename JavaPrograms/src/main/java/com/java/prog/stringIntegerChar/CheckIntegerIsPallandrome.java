package com.java.prog.stringIntegerChar;

public class CheckIntegerIsPallandrome{
	public static void main(String[] args) {
		
		System.out.println(isNumberPallandrome(123454321));
		System.out.println(isNumberPallandrome(123421));
		System.out.println(isNumberPallandrome(12321));
		System.out.println(isNumberPallandrome(0));;
	}

	private static boolean isNumberPallandrome(int num) {
		if(num==0)
			return false;
		int temp=num;
		int reverseNo=0;
		int reminder =0;
		while(temp>0) {
			reminder = temp%10;
			reverseNo = reverseNo*10 + reminder;
			temp/=10;
		}
		
		return num==reverseNo ?true:false;
		
	}

}
