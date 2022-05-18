package com.acc.IOdemo;
import java.io.*;
public class DataStreamDemo {

	public static void main(String[] args) {
	try {
		DataOutputStream dout=new DataOutputStream(new FileOutputStream("data.txt"));
		dout.writeUTF("Hello,Show me Encode data");
		dout.close();
		System.out.println("success");
	}catch(Exception e) {
		System.out.println(e);
	}
	try {
		DataInputStream din=new DataInputStream(new FileInputStream("data.txt"));
		while(din.available()>0) {
			String dt=din.readUTF();
			System.out.println(dt+" ");
		}
	}catch(Exception e) {
		System.out.println(e);
	}

	}

}
