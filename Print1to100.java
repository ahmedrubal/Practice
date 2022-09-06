package javaDemo;

import java.util.HashSet;

public class Print1to100 {

	public static void main(String[] args) {

	/*	// Approach One : Using for loop .

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}

		// Approach Two : Using while loop

		int num = 1;
		while (num <= 100) {
			System.out.println("Number is : " + num);
			num++;
		}

		int value = 0;
		if (value <= 100) {
			System.out.println(value);
			value++;
		}
		*/

		// Approach One:
		/*boolean flag = false;
		int arr[] = { 2,3,4,7};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i +1; j< arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found duplicate element from an array"+ ""+ ""+arr[i]);
					flag = true;
				}
			}

		}
		if (flag == false) {
			System.out.println("No duplicate element present");
			}*/

		// Approach Two Using collection HashSet
		String array[] = { "Java", "Python", "Ruby", "c++" };
		HashSet<String> hash = new HashSet<String>();
		boolean flag1 = false;
		for (String s : array) {
			if (hash.add(s) == false) {
				System.out.println("found duplicate element");
				flag1 = true;

			}

		}
		if (flag1 == false) {
			System.out.println("element not duplicate in an array");
		}

	}

}
