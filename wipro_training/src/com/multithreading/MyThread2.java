package com.multithreading;

class MyThread2 extends Thread
{
	Table t;
	//parameterized constructor
		MyThread2(Table t)
		{
			this.t=t;
		}
		
		public void run()
		{
		    t.printTable(100);
		}
	
}
