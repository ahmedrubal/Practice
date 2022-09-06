package javaDemo;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextDataFile {

	public static void main(String[] args) throws IOException {
	  FileReader file = new FileReader("..\\\\seleniumPractice\\\\File Storage\\\\File123.txt");
	  BufferedReader bw = new BufferedReader(file);
	  String str; //We are initializing variable str to store every line into it   
	  while((str=bw.readLine())!=null){
		  System.out.println("Read Line : " + str);
		 
	  }
	  System.out.println("Finished file reading");
	  
	  bw.close();
    

	}

}
