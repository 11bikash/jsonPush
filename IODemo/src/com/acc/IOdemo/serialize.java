package com.acc.IOdemo;
import java.io.*;
public class serialize {

	public static void main(String[] args) {
		//Serialization
		company com1=new company(100,"Accenture","Bangalore");
		company com2=new company(200,"Accenture","Kolkata");
		try {
		FileOutputStream fout=new FileOutputStream("seralize.txt");
		ObjectOutputStream out =new ObjectOutputStream(fout);
		out.writeObject(com1);
		out.writeObject(com2);
		out.flush();
		out.close();
	}catch(Exception e) {
		System.out.println(e);
	}
		
		System.out.println("success");
		
		//DeSerialization
 try {
	 ObjectInputStream in=new ObjectInputStream(new FileInputStream("seralize.txt"));
	 //company c1=(company)in.readObject();
	 company c1=(company)in.readObject();
	 company c2=(company)in.readObject();
	
	 System.out.println(c1.comp_id+"\n"+c1.comp_name+"\n"+c1.location);
	// System.out.println(c1.comp_id+"\n"+c1.comp_name+"\n"+c1.location);
	 
 }catch(Exception e) {
	 System.out.println(e);
 }
}
	
}
