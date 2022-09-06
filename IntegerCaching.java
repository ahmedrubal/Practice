package javaDemo;

public class IntegerCaching {

	public static void main(String[] args) {
		
		/* For Integer Caching we have to follow certain conditions : 
		 * Condition 1 : Must use wrapper class Integer Data type. 
		 * Condition 2 : Integer Caching has range -128 to 127. 
		 * if we compare number outside of range(-128 to 127) it always will give both are not equal
		 */
	  
		Integer num1 = 100; 
		Integer num2 = 100;
		if(num1==num2) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}

	}

}
