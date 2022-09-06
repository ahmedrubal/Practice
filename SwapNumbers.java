package javaDemo;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//How to Swap Numbers
		
		int a = 10; 
		int b = 20; 
		/*
		System.out.println("Before swaping a = "+a);
		System.out.println("Before swaping b = "+ b);
	  // Logic 1: Using 3 Variable
		int t = a; //10
		a = b; //20
		b = t; //10 
		System.out.println("After Swaping a = "+ a);
		System.out.println("After Swaping b = "+ b);
		*/
		
		// Logic 2  : Using + - Operators
		/*a = a+b; //10+20 = 30
		b = a-b; //30-20 = 10
		a = a-b; //30-10 = 20
		System.out.println("Using Logic 2 a = "+a); 
		System.out.println("Using Logic 2 b = "+b); 
		*/
		
		// Logic 3 : Using * (Multiply) and /(divide)
		/*a = a*b; // 10*20 = 200
		b = a/b; // 200/20 = 10
		a = a/b; //200/10 = 20
		System.out.println("Using Logic 3 a = "+a); 
		System.out.println("Using Logic 3 b = "+b); */
		
		//Logic 4 : using single statement 
		b= a+b-(a=b); 
		System.out.println("Using Logic4: a = "+a); 
		System.out.println("Using Logic4: b = "+b);
		
		
		
		
		
		
	
		

	}

}
