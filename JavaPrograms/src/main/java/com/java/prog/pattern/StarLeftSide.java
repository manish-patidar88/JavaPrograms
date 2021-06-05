package com.java.prog.pattern;

public class StarLeftSide {
	
	public static void main(String[] args) {
		//leftPattern(5);
		//leftPatternReverse(5);
		//leftFullStarPattern();
		starleftPattern(5);
	}
	/**
	 * star pattern *
	 * 				* *
	 * 				* * *
	 * 				* * * * 
	 */
	//@Test
	public static void leftPattern(int index) {
		for(int i=1;i<index;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
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
	
	public static void starleftPattern(int index) {
		
		/*for(int i=1;i<index;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=index;i++) {
			for(int j =i;j<=index;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=index;i++) {
			
			for(int k=i;k<=index;k++) {
				System.out.print(" ");
			}
			
			for(int j =1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}
	

}
