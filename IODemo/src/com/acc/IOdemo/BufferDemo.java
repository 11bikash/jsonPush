package com.acc.IOdemo;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.*;
public class BufferDemo {

	public static void main(String[] args) {
	try {
		FileOutputStream fout=new FileOutputStream("buffer.txt");
		BufferedOutputStream buff=new BufferedOutputStream(fout);
		String str="Here is my buffer ";
		byte b[]=str.getBytes();
		buff.write(b);
		buff.flush();//required if one stream connected with other stream
		buff.close();
		fout.close();
		System.out.println("success");
	}catch(Exception e) {
		System.out.println(e);
	}
	}

}
