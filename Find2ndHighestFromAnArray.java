package javaDemo;

import java.util.Arrays;

public class Find2ndHighestFromAnArray {

	public static void main(String[] args) {
		
		//Approach one Sorting the array
		
		int []array = {2,100,10,40,30,80};
		Arrays.sort(array);
		System.out.println("Sorted array: "+" "+Arrays.toString(array));
		System.out.println("Second largest number is : "+" "+array[array.length-2]);
		
    // Approach Two building customize logic
		
		/*int arr[] = { 10, 2, 4, 5, 80, 70 };
		int highest = 0;
		int secondHighest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				secondHighest = highest;
				highest = arr[i];
			} else if (arr[i] > secondHighest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("This is the array:"+" "+Arrays.toString(arr));
		System.out.println("2nd highest number is: "+" "+ secondHighest);
		*/

	}

}
