package com.java.prog.stringIntegerChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateWords {
	
	
	public static void main(String[] args) {
		String str = "I love java coding. java is most commonly used language. most of java language is ";
		findDuplicateWords(str);
	}
	public static void findDuplicateWords(String str) {
		
		String[] arrWords = str.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word : arrWords) {
			if(!word.isEmpty()) {
				if(map.containsKey(word)) {
					map.put(word, map.get(word)+1);
				}else {
					map.put(word, 1);
				}
			}
		}
		
		//Iterator
		/*Iterator<String> tmpString = map.keySet().iterator();		
		while(tmpString.hasNext()) {
			String tmp = tmpString.next();
			if(map.get(tmp)>1) {
				System.out.println("word "+ tmp + " appeard "+ map.get(tmp));
			}
		}*/

		//for each loop
		for(Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getKey() != null) {
				if(entry.getValue()>1) {
					System.out.println("Word '"+ entry.getKey() + "' has occurred " + entry.getValue() + " times");
				}
							
			}
		}
		
	}
}


