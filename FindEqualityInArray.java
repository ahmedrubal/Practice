package javaDemo;

import java.util.Arrays;

public class FindEqualityInArray {

	public static void main(String[] args) {
		int []arr1 = {1,2,9,4,5};
		int []arr2 = {1,2,3,4,5}; 
		
		int one = arr1.length;
		int two = arr2.length; 
		
		boolean equalityStatus = Arrays.equals(arr2, arr1); 
		if(equalityStatus==true) {
			System.out.println("Both array is Equal");
			
			for(int i = 0; i<one; i++) {
				if(arr1[i]==arr2[i])
					System.out.println("Every element is same in array:"); 
				else {
					System.out.println("Every element is not same");
				}
			}
			
		}
		else {
			System.out.println("Both array is not Equal");
		}
		System.out.println("********---********");
		
		
		//Approach Two : 
		
		boolean status =true;
		if(one==two) {
			for(int i =0; i<one; i++) {
				if(arr1[i]!=arr2[i])
					status=false;
				
			}
		}
		else {
			status=false;
		}
			
		
		if(status==true)
			System.out.println("Both Array is Equal");
		else {
			System.out.println("Both Array is not Equal");
			
		}
			

	}

}
