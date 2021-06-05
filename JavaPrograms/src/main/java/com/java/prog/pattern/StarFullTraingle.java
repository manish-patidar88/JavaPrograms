package com.java.prog.pattern;

public class StarFullTraingle {

	public static void main(String[] args) {
		//rightStarPattern();
		//rightPatternReverse();
		//starTrainglePattern();
		numberFullTriangle();

	}
	/**
	 * star pattern 		*
	 * 					  * * *
	 * 				    * * * * *
	 * 				  * * * * * * *
	 */
	public static void starTrainglePattern() {
		for(int i=1;i<=5;i++) {
			for(int k=8;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print(" *");
				//System.out.print(" ");
			}
			System.out.println();
		}
	}

	/**
	 * star pattern Number
	 */
	public static void numberFullTriangle() {

		for(int i=1;i<=5;i++) {
			for(int k=8;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print(" "+i);
				//System.out.print(" ");
			}
			System.out.println();
		}
	}


}
