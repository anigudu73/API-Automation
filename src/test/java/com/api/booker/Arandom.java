package com.api.booker;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Arandom {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Setup done before test2");
	}
	
	@Test
	public void test()
	{
		System.out.println("i am in class Arandom");
	}

}
