package com.acc.IOdemo;
import java.io.*;
public class FileStreamDemo {

	public static void main(String[] args) {
		try {
			FileWriter fwr=new FileWriter("write.txt");
			//FileWriter fwr=new FileWriter("C:/Users/bikash.a.sharma/test.txt");
			fwr.write("My Stream is Java");
			String st1=" Hi";
			fwr.append(st1);
			fwr.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("success");

	}

}
