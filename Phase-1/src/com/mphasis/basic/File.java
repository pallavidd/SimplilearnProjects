package com.mphasis.basic;

import java.io.FileOutputStream;
import java.io.IOException;

public class File {
public static void main(String[]args) throws IOException {
	FileOutputStream fos=new FileOutputStream("a.txt");
	FileOutputStream num = null;
	if(fos!=num) {
		System.out.println("file created an opened write mode");
		
	}
	String input="hi how are u";
	byte b[]=input.getBytes();
	fos.write(b);
	System.out.println("write operation completed");
	fos.close();
}
}
