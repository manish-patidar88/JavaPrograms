package com.java.prog.stringIntegerChar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class FindCharOccurrence2Highest {

	static final int NO_OF_CHARS = 256;
	public static void main(String[] args) {
		String str = "DevLabsAlliance";
		findCharOccrence2ndHighest(str);
		//System.out.println(getSecondMostFreq(str));
	}
	static char getSecondMostFreq(String str)
	{
		//count number of occurences of every character
		int[] count = new int[str.length()];
		int i;
		int j=0;
		int t = 0;
		for (i=0; i< str.length(); i++) {
			t = (int)str.charAt(i);
			count[j]=t;
			j++;
		}
		// Traverse through the count[] and find second highest element.
		int first = 0, second = 0;
		for (i = 0; i < count.length; i++)
		{
			/* If current element is smaller than
	    first then update both first and second */
			if (count[i] > first || count[i]>second){
				if(count[i]>first) {
					second = first;
					first = count[i];	
				}else {
					second=count[i];
				}				
			}
		}
		
		return (char)first;
	}

private static void findCharOccrence2ndHighest(String str) {

	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	char[] ch= str.toCharArray();
	for(char c:ch){
		if(map.containsKey(c)){
			map.put(c,map.get(c)+1);   
		}else{
			map.put(c,1);   
		}
	}
	int max = 0;
	int secondLarg=0;
	char key = 0 ;
	for(Entry<Character, Integer> entry : map.entrySet()) {
		System.out.println("Key is :"+ entry.getKey() +" value is :"+entry.getValue());
		int currentValue=entry.getValue();
		if(currentValue>max || currentValue>secondLarg) {
			if(currentValue>max) {        			 
				if(max>=secondLarg) {
					secondLarg=max;
				}        			
				max=currentValue;
			}else {
				secondLarg=currentValue;
				key=entry.getKey();
			}

		}
	}
	System.out.println("Second largest key: "+key + " count "+ secondLarg);

}

}
