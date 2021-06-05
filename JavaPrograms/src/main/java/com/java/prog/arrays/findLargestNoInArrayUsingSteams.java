package com.java.prog.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

public class findLargestNoInArrayUsingSteams {
	
	public static void main(String[] args) {
		int arr[] = {34,60,11,56,96,0,-1,-76};
		findLargestNoUsingSteams(arr);
	}
	
	private static void findLargestNoUsingSteams(int[] arr) {
		//List<Integer> myArray= Arrays.asList(ArrayUtils.toObject(arr));
		List<Integer> myArray = Arrays.stream(arr).boxed().collect(Collectors.toList());
		//List<Integer> myArray = IntStream.of(arr).boxed().collect(Collectors.toList());
		
		int largeNo= myArray.stream().max(Integer::compare).get();
		System.out.println(largeNo);
		
		System.out.println("------ 2nd way----------");
		int lNo=Arrays.stream(arr).max().getAsInt();
		System.out.println(lNo);
		
		System.out.println("------ min no.----------");
		int minNo= myArray.stream().min(Integer::compare).get();
		System.out.println("Mimimum no in 1st way :"+minNo);
		
		System.out.println("------ 2nd way min no.----------");
		int minNo1= Arrays.stream(arr).min().getAsInt();
		System.out.println("Minimum No. In 2nd way :"+ minNo1);
	}
	
}
