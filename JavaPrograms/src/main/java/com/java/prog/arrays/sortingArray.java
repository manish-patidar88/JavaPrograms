package com.java.prog.arrays;

import java.util.Arrays;

public class sortingArray {
	public static void main(String[] args) {
		int[] array = {9,2,4,7,8,0,3};
		sortArray(array);
		//sortArrays(array);
	}

	private static void sortArrays(int[] array) {
		Arrays.sort(array);
		//System.out.println(array.toString());
	}

	private static void sortArray(int[] array) {
		
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(array.toString());		
	}
}
