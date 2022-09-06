package javaDemo;

import java.util.HashSet;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		// Approach 1 :

		String str[] = { "Java", "C", "C++", "Python", "Java", "Python" };
		boolean flag = false;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println("Found duplicate element " + str[i]);
					flag = true;
				}
			}
		}
		if (flag == false)
			System.out.println("No duplicate element found");

		// Approach 2 :
		String arr[] = { "Java", "C", "C++", "Python" };
		HashSet<String> hash = new HashSet<>();
		boolean flag1 = false;
		for(String d:arr) {
			if(hash.add(d)==false)
				System.out.println("Found duplicate "+d);
			flag1 =true;
		}
		if(flag1==false)
			System.out.println("Duplicate not present");
		
		
	

	}

}
