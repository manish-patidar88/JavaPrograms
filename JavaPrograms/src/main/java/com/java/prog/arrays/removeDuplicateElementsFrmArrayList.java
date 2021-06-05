package com.java.prog.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeDuplicateElementsFrmArrayList {
	public static void main(String[] args) {
		String[] arr=  {"Dev", "Labs", "Alliance", "Dev", "Labs", "Dev", "DevLabsAlliance"};
        List<String> al = Arrays.asList(arr);
        List<String> al1=new ArrayList<>();
        for(int i=0;i<al.size();i++){
            if(!al1.contains(al.get(i))){
               al1.add(al.get(i));
            }
        }
         
         System.out.println(al1);
     }
}
