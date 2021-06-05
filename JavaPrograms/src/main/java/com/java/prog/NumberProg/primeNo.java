package com.java.prog.NumberProg;

public class primeNo {

	public static void main(String[] args) {
		System.out.println("0 is Prime No "+ isPrimeNumber(0));
		System.out.println("2 is Prime No "+ isPrimeNumber(2));
		System.out.println("13 is Prime No "+ isPrimeNumber(13));
		System.out.println("5 is Prime No "+ isPrimeNumber(5));
		System.out.println("10 is Prime No "+ isPrimeNumber(10));
		System.out.println("1 is Prime No "+ isPrimeNumber(1));
		System.out.println("-1 is Prime No "+ isPrimeNumber(-1));	
		
		getPrimeNumbers(20);
	}
	
	public static void getPrimeNumbers(int num){
		for(int i=1;i<=num;i++){
			if(isPrimeNumber(i)){
				System.out.print("Number: "+i +" is Prime");
			}			
		}
	}
	
	public static boolean isPrimeNumber(int num){
		if(num <=1){
			return false;
		}
		for(int i =2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;		
	}
}
