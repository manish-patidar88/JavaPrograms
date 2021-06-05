package com.java.prog.NumberProg;

public class armStrongNo {

	public static void main(String[] args) {
		//System.out.println(isNumberAmrstring(153323));
		System.out.println(isNumberAmrstringReduced(153));
	}
	
	//(a^n) + (b^n) + (c^n)  
	public static boolean isNumberAmrstring(int num){	
		int collIntger = 0;
		boolean isArmstrong = false;
		String arr[] = String.valueOf(num).split("");
		final int length = arr.length;
		for(int i = 0;i<length;i++){
			collIntger = collIntger + getNthPowerMultiplication(Integer.valueOf(arr[i]),length);
		}
		System.out.println(collIntger);
		if(collIntger==num){
			isArmstrong = true;
		}
		return isArmstrong;
	}
	public static int getNthPowerMultiplication(int num,int base){
		int sum = 1;
		int i = 1;
		while(i<=base){
			sum = sum * num;
			i++;
		}
		return sum;
	}
	public static boolean isNumberAmrstringReduced(int num){
		final int  num1 = num;
		boolean isArmstrong = false;
		int reminder = 0,sum = 0;
		while(num!=0){
			reminder = num%10;
			sum = sum + getNthPowerMultiplication(reminder,String.valueOf(num1).length());
			num = num/10;
		}
		if(sum==num1){
			isArmstrong = true;
		}
		return isArmstrong;		
	}
}
