package com.java.prog.stringIntegerChar;

public class SeprateCharNumSpecialChar {
	public static void main(String[] args) {
		String myString = "this100ismynew%!@$(*S5tr3ings";
		seprateElements(myString);
	}

	private static void seprateElements(String myString) {
		String num = "";
		String letter="";
		String specialChar="";
		String[] arrString = myString.split("");
		for(int iCnt=0;iCnt<arrString.length;iCnt++) {
			Character ch =myString.charAt(iCnt);
			if(Character.isDigit(ch)) {
				num = num  + ch;
			}else if(Character.isLetterOrDigit(ch)) {
				letter = letter + ch;
			}else {
				specialChar = specialChar + ch;
			}
		}
		
		System.out.println("Number :"+ num);
		System.out.println("letters :"+ letter);
		System.out.println("Special char :"+ specialChar);
	}
	
	
}
