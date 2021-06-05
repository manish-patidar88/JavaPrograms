package com.java.prog.stringIntegerChar;

public class CheckStringIsPallandrom {

	public static void main(String[] args) {
		String str="nitain";
		System.out.println(str+ ": output is :"+ isGivenStringPallandrom(str));
		str="abcdcba";
		System.out.println(str+ ": output is :"+ isGivenStringPallandrom(str));
	}
	private static boolean isGivenStringPallandrom(String str) {
		if(str==null || str.isEmpty())
			return false;
		
		String revString = "";
		for(char c:str.toCharArray()) {
			revString = c + revString;
		}  

		if(str.equals(revString)){
			return true;
		}
		return false;

	}

}
