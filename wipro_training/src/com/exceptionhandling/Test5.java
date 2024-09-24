package com.exceptionhandling;

public class Test5 {

	
	public void checkProduct(int weight)
	{
		if(weight>100)
		{
			System.out.println("product is valid");
		}
		else
		{
			try {
			throw new InvalidProductException("product is invalid");
			}
			catch(InvalidProductException ip)
			{
				System.out.println(ip.getMessage());
			}
			System.out.println("rest statements will be executed");
		}
	}
}
