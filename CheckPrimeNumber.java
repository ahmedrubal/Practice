package javaDemo;

// Natural Number >1
// Number is divided by 1 and Itself Exam: 1 , 5 ,19,3 These are Prime Number 
// Exam : 5 divided by 1 and 5 (5/1,5/5)
// 19 : 1 , 19 is Prime number 
//28: 1, 2, 4,7,14 and 28 Is not a Prime number
// Note : Prime number is something should not be divided more than 2 numbers

public class CheckPrimeNumber {


	public static void main(String[] args) {
		
		int num = 19; 
		int count = 0; 
		if(num>0) {
			
			// Here in for loop must started from 1 because you can't divide number by 0
		  for(int i =1; i<=num; i++) {
			  if(num%i==0) // Number should produce reminder as 0 After dividing them
				  count++;	// if it is matching condition then increase count variable
			}
		  if(count==2) // If count == 2 that means number only divided by 1 and itself
			  System.out.println("Prime Number");
		  else {
			  System.out.println("Not Prime Number");
		  }
		}
		else {
			System.out.println("Number not falling under first conditon"); 
		}
		

	}

}
