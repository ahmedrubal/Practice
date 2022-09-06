package javaDemo;

public class FindEvenAndOddNumberFromArray {
	
	public  void evenNumber() {
		int arr[] = {1,2,4,5,6,8};
		for(int i = 0; i<arr.length; i++) 
			if(arr[i]%2==0) {
				System.out.println("Even Number from an array: "+ arr[i]);
		}
	}
	public void evenNubmerUsingFor() {
		int arr[] = {1,2,4,5,6,8};
		for( int value:arr) {
			if(value%2==0) 
				System.out.println("Even Number using For Each Loop : "+ value);
				}
		
	}
	
	public void oddNumber() {
		int arr[] = {3,5,7,8,9,0,11};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2!=0) 
				System.out.println("Odd number from an array: "+ arr[i]); 		
		}
			}
	public void oddNumUsingForEachLooop()
	{
		int a[]= {4,5,9,7,11,45};
		for(int val:a) {
			if(val%2!=0)
				System.out.println("Odd Value using for Each loop : "+val);
		}
	}
	
	public static void main(String[] args) {
		FindEvenAndOddNumberFromArray obj = new FindEvenAndOddNumberFromArray(); 
		System.out.println("  ##Just started Printtin###  ");
		obj.evenNumber();
		System.out.println("------***********------");
		obj.evenNubmerUsingFor();
		System.out.println("------***********------");
		obj.oddNumber();
		System.out.println("------***********------");
		obj.oddNumUsingForEachLooop();
		

	}

}
