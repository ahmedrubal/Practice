package javaDemo;

public class DivideByZero {

	public static void main(String[] args) {
		
	/* int number divided by Zero always give java.lang.ArithmeticException
	 * Other type of numbers produce Infinity Or NaN(No value or Null)
	 * 
	 */
		//System.out.println(9/0); 
		//System.out.println(0/0);
		System.out.println(1.2/0); //double/0 = infinity
		System.out.println(1.2/0.0); //infinity
		System.out.println(0.0/0.0);  // NaN
		System.out.println(12.33f/0); //Infinity
		System.out.println(12.33f/0.0); //Infinity
		System.out.println(12.338888d/0); // Infinity
		

	}

}
