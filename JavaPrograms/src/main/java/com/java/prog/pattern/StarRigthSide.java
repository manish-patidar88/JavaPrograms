package com.java.prog.pattern;

public class StarRigthSide {

	public static void main(String[] args) {
		//rightStarPattern();
		//rightPatternReverse();
		rightFullStarPattern();

	}
	/**
	 * star pattern 		*
	 * 					  * *
	 * 				    * * *
	 * 				  * * * * 
	 */
	public static void rightStarPattern() {
		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
				//System.out.print(" ");
			}
			System.out.println();
		}
	}

	/**
	 * star pattern * * * *
	 * 				  * * *
	 * 				    * * 
	 * 				      *  
	 */
	public static void rightPatternReverse() {

		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j =5;j>=i;j--) {
				System.out.print("*");		
			}
			System.out.println();
		}
	}


	/**
	 * star pattern       *
	 * 				    * *
	 * 				  * * *
	 * 				* * * *
	 * 				  * * *
	 * 				    * *
	 *                    *
	 */
	public static void rightFullStarPattern() {


		for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}


		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j =5;j>i;j--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}


}
