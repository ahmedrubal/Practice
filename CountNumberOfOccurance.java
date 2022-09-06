package javaDemo;

import java.util.HashMap;

public class CountNumberOfOccurance {

	public static void main(String[] args) {
		/* Add below line for not count empty space
		 * if(!String.valueOf(a).isBlank(){  	
		  if(map.containsKey(a)) {
			map.put(a,map.get(a)+1);
		}else {
			map.put(a,1);
		}
		}
		
		 * -----Add below lines to get empty space count---
		 * if(String.valueOf(a).isBlank()==true) {
		 * 	if(map.containsKey(a)) {
			map.put(a,map.get(a)+1);
		}else {
			map.put(a,1);
		}
		} 
		*/
		
		String s ="Welcome to java";
		char[]array = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char a:array) {
	        if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}else {
				map.put(a,1);
			}
			
	
		}
		System.out.println(s+":"+map);

	}

}
