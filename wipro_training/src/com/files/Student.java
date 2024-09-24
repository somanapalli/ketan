package com.files;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int stid;
	private transient String stname;
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student()
	{
		
	}
	public Student(int stid, String stname)
	{
		this.stid=stid;
		this.stname=stname;
	}
	public String toString()
	{
		return stid + " " + stname;
	}

}
