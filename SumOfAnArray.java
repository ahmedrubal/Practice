package javaDemo;

public class SumOfAnArray {

	public static void main(String[] args) {
		
		
		 //Find Out a total of all elements from an array
		//Approach 1: Using For Loop 
		
		int array[] = {4,6,10,20,30}; //Total =70
		int sum =0; 
		for(int i =0; i<array.length; i++) {
			sum=sum+array[i]; 
	
		}
		System.out.println("Sum of all Elements: "+ sum);
		System.out.println("*******");
		
		// Approach 2: Using ForEach Loop
		
		int arr[] = {4,6,10,20,30,40,10}; //Total =120
		int total =0; 
		for(int value:arr) {
			total=total+value;
		}
		System.out.println("Total of All Elements using Enahanched Loop: **"+ total); 
		
		

	}

}
