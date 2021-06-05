package com.java.prog.stringIntegerChar;

public class ReverseString {
	public static void main(String []args){
		//String myWord = "my name is manish patidar workginjava";
		String myWord = "ilovecoding";
		//System.out.println(findReverseString(myWord));
		//System.out.println(reverseString(myWord));
		System.out.println(revString(myWord));
	}

	public static String findReverseString(String word){
		String arrWords[] = word.split(" ");
		String revString="";
		for(String myWord:arrWords){
			revString = myWord + " "+ revString;
		}
		return revString;
	}
	public static String reverseString(String word){
       // String arrWords[] = word.split("");
        String revString="";        
        for(char ch:word.toCharArray()){
            revString = ch + ""+ revString;
        }
    return revString;
    }
	
	public static String revString(String word) {
		String str[] = word.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=str.length-1;i>=0;i--) {
			sb = sb.append(str[i]);
		}
		System.out.println(sb);
		
		return sb.toString();
		
	}
}