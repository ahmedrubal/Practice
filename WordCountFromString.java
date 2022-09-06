package javaDemo;

import java.util.Scanner;

public class WordCountFromString {

	public static void main(String[] args) {
//		System.out.println("Enter user Input");
//		Scanner sc = new Scanner(System.in);
//	    String text = sc.nextLine();
		String text = "welcome to java learning programe";
	    int count = 1;
	    for(int i = 0; i<text.length()-1; i++) {
	    	  if((text.charAt(i)==' ') && (text.charAt(i+1)!=' '))
	    		  count++;
	    }
	    System.out.println("Number of words in a String: "+count);
	  
		

	}

}
