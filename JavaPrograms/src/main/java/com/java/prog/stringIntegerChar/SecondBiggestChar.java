package com.java.prog.stringIntegerChar;

public class SecondBiggestChar {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopq";
		System.out.println(secondBiggestCharFromString(str));
	}

	private static char secondBiggestCharFromString(String str) {
		
        char[] c=str.toCharArray();
        char max=c[0];
        char secondHig=c[0];
		for(int i=0;i<c.length;i++) {
			if(c[i]>max){
			    if(c[i]>secondHig){
			        secondHig=max;   
			    }
			    max=c[i];
			}else if(c[i]>secondHig){
			    secondHig=c[i];
			}
		}
        return secondHig;
		
	}

}
