package javaDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HowToWriteFile {

	public static void main(String[] args) throws IOException {
		FileWriter file =new FileWriter("..\\seleniumPractice\\File Storage\\File123.txt"); 
		BufferedWriter bw = new BufferedWriter(file);
		bw.write("java is a language");
		bw.newLine();
		bw.write("I am able to write txt file");
		bw.newLine();
		System.out.println("File is Created");
		bw.close();
		

	}

}
