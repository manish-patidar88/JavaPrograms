package com.java.prog.stringIntegerChar;

public class CheckStringContainDigitOrNot {
	public static void main(String[] args) {		 
		//System.out.println(checkStringContainDigit("1212A"));
		System.out.println(checkStringContainDigits(""));
		System.out.println(checkStringContainDigits(null));
		System.out.println(checkStringContainDigits("131"));
	}

	private static boolean checkStringContainDigit(String str) {		
		return str.matches("[0-9]+");		
	}
	private static boolean checkStringContainDigits(CharSequence ch) {
		if(ch==null || ch.length()==0) return false;
		//char[] ch=str.toCharArray();
		for(int i=0;i<ch.length() ;i++) {
			if(!Character.isDigit(ch.charAt(i))) {
				return false;
			}
		}		
		return true;		
	}	
}
