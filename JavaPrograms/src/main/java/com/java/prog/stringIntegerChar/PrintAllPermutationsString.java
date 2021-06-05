package com.java.prog.stringIntegerChar;

public class PrintAllPermutationsString {
	public static void main(String[] args) {
		
		 String d = "Dev";
		// System.out.println(d.substring(2));
         permutation(d, "");
		
	}
	static void permutation(String s, String result)
    {
        // If string is empty
        if (s.length() == 0) {
            System.out.print(result + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            // ith character of string
            char ch = s.charAt(i);
            // Remaining string after excluding the ith character
            String remainStr = s.substring(0, i) + s.substring(i + 1);
            // Recursive call
            permutation(remainStr, result + ch);
        }
    }
}
