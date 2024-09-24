package com.java8;

@FunctionalInterface
public interface i1 {
	static int sum(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y);	
}
