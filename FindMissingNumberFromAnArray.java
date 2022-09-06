package javaDemo;

public class FindMissingNumberFromAnArray {

	public static void main(String[] args) {
		/*
		 * Find Them we have to follow some rules
		 * Rules : Array should not have duplicate  elements
		 * Rules : Array no need to be sorted order
		 * Rules : Array elements must have proper range 
		 * Example : int array[] = {1,2,3,5} Here 4 is missing Number range is proper it has 1 at beginning and 5 end
		*/
		int sum = 0; 
		int array[] = {1,2,3,5};
        for(int i = 0; i<array.length; i++) {
        	sum=sum+array[i];
			
		}
        System.out.println("Sum of elements an array:"+" "+sum);
        
        int sum2 = 0; 
        // This for loop is used to loop through the number range 1 to 5
        // Here int i = 1 Because I am looping through number range 1 to 5
        for(int i=1; i<=5; i++) {
        	sum2 = sum2+i; //1 3 6 10 15 
        }
        System.out.println(sum2);
        System.out.println("Missing number is :"+" "+ (sum2-sum));

	}

}
