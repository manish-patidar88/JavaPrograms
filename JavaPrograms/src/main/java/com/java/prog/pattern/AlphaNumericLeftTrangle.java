package com.java.prog.pattern;

public class AlphaNumericLeftTrangle {
	
	public static void main(String[] args) {
		alphabetleftPattern();
		//leftPatternReverse(5);
		//leftFullStarPattern();
	}
	/**
	 * star pattern A
	 * 				B C
	 * 				A B C
	 * 				A B C D 
	 */
	public static void alphabetleftPattern() {
		int alpha = 65;
		for(int i=0;i<5;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print((char)(alpha+j));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/**
	 * star pattern * * * *
	 * 				* * *
	 * 				* * 
	 * 				*  
	 */
	public static void leftPatternReverse(int index) {
				
		for(int i=1;i<=index;i++) {
			for(int j =index;j>=i;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * star pattern *
	 * 				* *
	 * 				* * *
	 * 				* * * *
	 * 				* * * 
	 * 				* *
	 *              * 
	 */
	public static void leftFullStarPattern() {
		
		for(int i=1;i<5;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j =5;j>i;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
