package com.java.prog.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.Test;

public class findLargeNoInArray {
	int array[][] = {{4,2,7,1},{20,70,40,90},{1,2,0}};
	double dblArray[][] = {{-4.7,-2.5,-7,-1.2},{-20.5,-70.6,-40.1,-90.1},{-1.5,-2.2,-0.0}};
	int arr[] = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
	
	@Test
	public void findLargestNoFromArrayInt() {
		System.out.println("Start Find largest no.from array: {{4,2,7,1},{20,70,40,90},{1,2,0}} ");
		int[] myArrayLarge=findArrayWithLargeNo(array);
		for(int arr:myArrayLarge){
			System.out.println(arr);
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void find2ndLargestNoFromArrayInt() {
		System.out.println("2nd largest no.from array: {{4,2,7,1},{20,70,40,90},{1,2,0}} ");
		int[] myArray2Large=findArrayWith2ndLargeNo(array);
		for(int arr:myArray2Large){
			System.out.println(arr);
		}
		System.out.println("---------------------");
	}
	
	@Test
	public void find2ndLargestNoFromArray() {
		System.out.println("2nd largest no.from array double: {{-4.7,-2.5,-7,-1.2},{-20.5,-70.6,-40.1,-90.1},{-1.5,-2.2,-0.0}}");
		double[]  myArray =findArrayWith2ndLargeNoDouble(dblArray);
		for(double arr:myArray){
			System.out.println(arr);
		}
		System.out.println("---------------------");
	}
	@Test
	public void findSecondHighestNoFromOneDimArray() {				
		System.out.println("Second highest no in one dim array : { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 }");
		System.out.println(secondHighestNumberInArray(arr));
		System.out.println("---------------------");
	}
	
	private static int secondHighestNumberInArray(int[] arr) {
	        int max=arr[0];
	        int secondMax=arr[0];
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>max){
	                secondMax=max;
	                max=arr[i];
	            }else if(arr[i]>secondMax && arr[i]!=max){
	                secondMax=arr[i];
	            }
	        }
	        return secondMax;
	}


	private static int[] findArrayWithLargeNo(int array[][]) {

		int max[] = new int[array.length]; 
		for(int i=0;i<array.length;i++){
			int temp=0;
			for(int j=0;j<array[i].length;j++){
				if(array[i][j]>temp){
					temp=array[i][j];
				}
			}
			max[i]= temp;
		}

		int temp=0;
		for(int k=0;k<max.length;k++){
			for(int j=k+1;j<max.length;j++){
				if(max[k]>max[j]){
					temp=max[k];
					max[k]=max[j];
					max[j]=temp;
				}    
			}

		}
		return max;

	}
	private static int[] findArrayWith2ndLargeNo(int array[][]) {

		int max[] = new int[array.length]; 
		for(int i=0;i<array.length;i++){
			int temp=0;            
			temp=array[i].length;
			Arrays.sort(array[i]);
			max[i]= array[i][temp-2];
		}
		//Arrays.sort(max);		
		return max;	
	}
	private static double[] findArrayWith2ndLargeNoDouble(double array[][]) {

		double max[] = new double[array.length]; 
		for(int i=0;i<array.length;i++){
			int temp=0;            
			temp=array[i].length;
			Arrays.sort(array[i]);
			max[i]= array[i][temp-2];
		}
		//Arrays.sort(max);		
		return max;	
	}

}
