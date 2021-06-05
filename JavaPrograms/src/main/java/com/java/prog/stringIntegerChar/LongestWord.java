package com.java.prog.stringIntegerChar;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		String str = "abc de#fg hijkl aa rhf09gtdjd d34sss";
		//Scanner s = new Scanner(System.in);
		System.out.println(maxLenghtOfWordCharAt(str));
		//System.out.println(maxLenghtOfWord(s.nextLine()));
		
	}

	private static String maxLenghtOfWord(String str) {
		String myArray[] = str.replaceAll("[^a-zA-Z//s]","").split(" ");
		String word="";
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i].length()>word.length()) {
				word=myArray[i];
			}
		}
		System.out.println(word);
		return word;
	}
	private static String maxLenghtOfWordCharAt(String str) {
		str = str.replaceAll("[^a-zA-Z\\s+]","");
		char[] ch = str.toCharArray();
		String word="";
		for(int i=0;i<ch.length;i++) {
			if((int)ch[i]>=65 && (int)ch[i]<=122 ) {
				word=word + ch[i];
			}
		}
		System.out.println(word);
		return word;
	}
	

}
