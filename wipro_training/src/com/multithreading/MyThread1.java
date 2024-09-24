package com.multithreading;

class MyThread1 extends Thread
{
	//association or has-a relation

	Table t;
	//parameterized constructor
	MyThread1(Table t)
	{
		this.t=t;
	}
	
	
	//logic of thread
	public void run()
	{
	    t.printTable(5);
	}
	
	
}

