package javaDemo;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
	
		
		String s ="Welcome to java";
		System.out.println("String before replacing space:"+" "+  s);
		
		String replace = s.replaceAll("\\s", "");
		System.out.println("String After Replaced space:"+ " "+ replace);
	

	}

}
