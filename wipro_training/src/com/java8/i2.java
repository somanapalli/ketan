package com.java8;

@FunctionalInterface
public interface i2 {
	void sub(int x, int y);
	
	public default void sum(int x, int y)
	{
		System.out.println(x+y);
	}
	public static void mul(int x, int y)
	{
		System.out.println(x*y);
	}

}
