package com.multithreading;

public class Test3 {
	//public abstract void run();
	public static void main(String[] args) {
	
		Thread thread = new Thread(
				()-> {
					for(int i=1;i<=10;i++)
					{
						System.out.println(i);
					}
				}
				
				);
		thread.start();
	}

}
