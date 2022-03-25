package com.training.cg1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class UpperCase {
	public static void main(String args[]) throws IOException {
		Writer fw = new FileWriter("fileoutputstream.text");
		String str1;
		System.out.println("Enter data which you want to put in the file");
		Scanner sc = new Scanner(System.in);
		str1= sc.next();
		str1 = str1.toUpperCase();
		fw.write(str1);
		fw.close();
		System.out.println("Your input is stored in uppercase");
		
		Reader fr = new FileReader("fileoutputstream.text");
		int data = fr.read();
				while(data!=-1) {
			System.out.print((char)data);
			data = fr.read();
		}
		fr.close();
	}

}
