package javaDemo;

public class SeperateUppercaseFromString {

	public static void main(String[] args) {
		
		// This is to Separate capital
		String s = "WeLCOME To JAva";
		String upper ="";
		String lower = "";
		for(int i = 0; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(ch>=65 && ch<=90) {
				 upper =upper+ch;
				
			 }else {
				 lower =lower+ch;
			 }
		}
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println("*************");
		
		// This is to count capital letter from a string
		String sr = "WelcoMetoJAvA";
		int capital = 0;
		int small = 0; 
		for (int i = 0; i<sr.length(); i++) {
			char c=sr.charAt(i); 
			if(c>=65 && c<=90) {
				capital++;
			}else {
				small++;
			}
		}
		System.out.println("capital: "+capital);
		System.out.println("small: "+small);

	}

}
