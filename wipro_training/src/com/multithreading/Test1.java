package com.multithreading;

public class Test1 extends Thread {
	
	@Override
	public void run()
	{
		//logic - can be executed by my own thread
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		Test1 obj = new Test1();//new state
		obj.setName("sanket");
		obj.start();//runnable state
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName() + "-->" + i);
			Thread.sleep(200);
		}
		
		
		Test1 obj1 = new Test1();
		obj1.setName("ketan");
		obj1.start();
		
		
		
	}

}
