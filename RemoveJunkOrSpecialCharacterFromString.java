package javaDemo;

public class RemoveJunkOrSpecialCharacterFromString {

	public static void main(String[] args) {
		/*
		 * Remove all the special character from a String we have to use replaceAll() method 
		 * along with regular expression [^a-zA-Z0-9]
		 * Here char at symbol ^ represents anything other than a-zA-Z0-9 should replace with "" empty space
		 We can use either [^a-z,A-Z,0-9] syntax or [^a-zA-Z0-9]
		 \\s or \s Representing to spaces in String 
		 */
	
		String str = "@^&()%Today is the best day@$*@";
		str= str.replaceAll("[^a-z,A-Z,0-9]", "");
		System.out.println(str);
		String s = " @#$ Java $%# is *^% language $%# ";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Remove White spaces from an String
		
		String remove = " Manha   Ahmed Rida ";
		System.out.println("Before removing white spaces  :"+" "+ remove);
		System.out.println("After removing white spaces  :"+" "+ remove.replaceAll("\\s",""));
		
		

	}

}
