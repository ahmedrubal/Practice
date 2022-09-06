package javaDemo;

import java.util.Arrays;

public class PracticeClass {

	public static void main(String[] args) {
	 
		int []arr = {10,2,70,50,80,100};
		int highest =0;
		int secondHighest =0;
		for(int i =0; i<arr.length; i++ ) {
			if(arr[i]>highest) {
				secondHighest=highest;
				highest=arr[i];
			}
			else if(arr[i]>secondHighest)
				secondHighest=arr[i];
		}
		System.out.println("This is the array:"+ " "+Arrays.toString(arr));
		System.out.println("Second largest number is : "+" " +secondHighest);

	}

}
