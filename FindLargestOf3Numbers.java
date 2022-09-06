package javaDemo;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		/*
		 * if we choose any number same as any of given number then 
		 * we follow following logic to get largest number out of them 
		 *Example :
		 * int n1 = 10; int n2 = 20; int n3 = 20;
				if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is largest" + " " + n1);

		} else if (n2 >= n1 && n2 >= n3) {

			System.out.println("n2 is largest : " + " " + n2);

		} else {
			System.out.println("n3 is largest : " + " " + n3);

		}
	
		 * 
		 */
		
	int num1 =400; 
	int num2 =800;
	int num3 =300; 
	
	  // ------Approach One-----
	if(num1>num2 && num1>num3) {
		System.out.println("Largest number is : "+ num1); 
		
	}
	else if(num2>num1 && num2>num3) {
		System.out.println("Largest number is : "+ num2);
		
	}else {
		System.out.println("Largest number is : "+ num3);
	}
	
	     //Approach Two---Using Ternary Operator---
	int largest = num1>num2?num1:num2;
	int largest2 = num3>largest?num3:largest;
	
	System.out.println("Largest number using Ternary Operator is : "+ largest2);
	
	//Approach 3 : Approach Two combining together
	int largNumber = num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
	System.out.println("large number: "+largNumber);

	}

}
