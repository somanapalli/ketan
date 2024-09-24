package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCalculator {

	static Calculator cal;
	@BeforeAll
	public static void setup()
	{
		cal = new Calculator();
	}
	@Test
	//@Disabled
	void testSum() {
		
		
		int result = cal.sum(3, 4);
		assertEquals(result, 7);
	}

	@Test
	void testSub()
	{
		
		int result = cal.sub(3, 2);
		assertEquals(result, 1);
	}
	
	@AfterAll
	public static void destroy()
	{
		cal = null;
	}
}
