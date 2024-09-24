package com.multithreading;

class Table
{
	//user defined business logic method
	//synchronized method
	//shared resource
	synchronized void printTable(int n)
	 {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(n*i);
			 try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
	
}