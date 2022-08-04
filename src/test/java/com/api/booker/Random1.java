package com.api.booker;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Random1 {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Setup done before test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("i am in class ramdom1");
	}

}
