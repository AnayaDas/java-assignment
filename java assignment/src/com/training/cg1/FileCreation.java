package com.training.cg1;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileOutputStream;
public class FileCreation {
	
	

	public static void main(String args[]) throws IOException {
		FileOutputStream file = new FileOutputStream("fileoutputstream.text");
		boolean val = false;
		if (file != null) {
			System.out.println("file created successfully");
		}
		
		else {
			System.out.println("failed to create file");
		}
		
		String str;
		System.out.println("Enter data which you want to put your file");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		 byte b[]=str.getBytes();
		 
		 FileOutputStream f  = new FileOutputStream("fileoutputstream.text");
		 f.write(b);	
		 System.out.println("Inserted data into file successfully");
	} 
	 
	    

}

