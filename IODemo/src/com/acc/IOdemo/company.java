package com.acc.IOdemo;
import java.io.*;
public class company implements Serializable{
	int comp_id;
	String comp_name;
	String location;
	public int getComp_id() {
		return comp_id;
	}
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}
	public company(int comp_id, String comp_name, String location) {
		super();
		this.comp_id = comp_id;
		this.comp_name = comp_name;
		this.location = location;
	}
	public String getComp_name() {
		return comp_name;
	}
	public void setComp_name(String comp_name) {
		this.comp_name = comp_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
