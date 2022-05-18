package com.acc.IOdemo;
import java.io.*;
public class FileIODemo {
public static void main (String args[]){
	try {
	FileOutputStream fout=new FileOutputStream("accenture.txt");
	String str="Today is Day 6";
	byte b[]=str.getBytes(); //converting String to byteArray
	fout.write(b);
	fout.close();
	System.out.println("success");
	}catch(Exception e) {
		System.out.println(e);
	}
	try {
		FileInputStream fin=new FileInputStream("Test.java");
		int i=0;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
		fin.close();
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
}
}
