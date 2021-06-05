package com.java.prog.stringIntegerChar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CharOccurrance {
	
	public static void main(String[] args) {
		
		//
		//
		//getDuplicateCharCount("I love coding of java",'o');
		
	}
	
	@Test
	public void findCharCount() {
		System.out.println("String: "+"I love coding of java");
		System.out.println(findCharCount("I love coding of java",'z'));
		System.out.println("--------------------------------");
	}
	@Test
	public void findDuplicateCharcterCount() {
		System.out.println("String: "+"I love coding of java");
		System.out.println(findDupCharCount("I love coding of java",'o'));
		System.out.println("--------------------------------");
	}
	
	@Test
	public void findEachCharCountInString() {
		String str = "devlabsalliance";
		System.out.println(str);
		EachCharCountInString(str);
		System.out.println("--------------------------------");
	}
	
	public static void getDuplicateCharCount(String str, char ch1) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch:str.toCharArray()) {
			if(ch!=' ') {
				if(map.containsKey(ch)) {
					map.put(ch, map.get(ch)+1);
				}else {
					map.put(ch, 1);
				}
			}			
		}		
		
		 for(Entry<Character, Integer> entry: map.entrySet()) {
			 if(entry.getKey()==ch1) {
				 System.out.println("Key "+ entry.getKey() + " value "+ entry.getValue());
				 break;
			 }
		 }
		 
		System.out.println(map);
		
	}
	
	public static int findCharCount(String str, char ch) {
		int count = 0;
		
		for(char c:str.toCharArray()) {
			if(c==ch) {
				count++;
			}
		}
		return count;
	}

	public static int findDupCharCount(String str, char ch) {
		int count = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
				
		return count;
	}
	
	public static void EachCharCountInString(String str){		
        char[] ch=str.toCharArray();
        ArrayList<Character> al = new ArrayList<Character>();
        for(int i=0;i<ch.length;i++){
            int count=1;
            if(!al.contains(ch[i])){
                for(int j=i+1;j<ch.length;j++){
                    if(ch[i]==ch[j]){
                        count++;
                    }    
                }
                System.out.println("Char '"+ ch[i]+"'" + " count "+count);
               al.add(ch[i]);
            }            
        }
	}
	
}
