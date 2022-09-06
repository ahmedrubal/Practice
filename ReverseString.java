package javaDemo;

public class ReverseString {

	public static void main(String[] args) {

		// Approach One For Single word in a String

		String str = "Java";
		char[] arr = str.toCharArray();
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + arr[i];

		}
		System.out.println(rev);

		// Approach two for multiple words in a String

		String s = "Java with selenium";
		String[] words = s.split(" ");
		String reverseString = "";
		for (String w : words) {
			System.out.println(w);
			String reverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);

			}
			reverseString = reverseString + reverseWord + " ";

		}
		System.out.println(reverseString);

	}

}
