package com.java.prog.stringIntegerChar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LenghtOfStringWithoutUsingLenghtMethod {	
	public static void main(String[] args) {
		String myString = "Automation Testing using Selenium";
		//method 1:
		char[] ch = myString.toCharArray();
		System.out.println("Method 1: " +ch.length);
		
		//method 2:
		int lenght=0;
		for(char c:ch) {
			lenght++;
		}
		System.out.println("Method 2: " +lenght);
		
		//method 3:
		int i =0;
		try {
			while(true) {
				myString.charAt(i);
				i++;
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Method 3: " + i);
		}
		
		//method 4:
		System.out.println("Method 4: " + myString.lastIndexOf(""));
		
		//method 5:
		Matcher m=Pattern.compile("$").matcher(myString);
		m.find();
		int len =m.end();
		System.out.println("Method 5: " + len);
		
		//method 6:
		String strArray[] =myString.split("");			
		int iCount = 0;
		for(String s: strArray) {
			iCount+=s.toCharArray().length;
		}
		System.out.println("Method 7: " + iCount);
	}
	
	
	
	/*private static int getStringLenght(String str) {
		String strArray[] =str.split("");			
		int iCount = 0;
		for(String s: strArray) {
			iCount+=s.toCharArray().length;
		}
		return iCount;			
	}*/
}
