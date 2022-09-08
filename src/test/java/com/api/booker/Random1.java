package com.api.booker;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;

public class Random1 {
	
	Object a;
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Setup done before test");
		//RestAssured.config.headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("Header1"));
	}
	
	@Test
	public void test1()
	{
		//System.out.println("i am in class ramdom1");
		
		System.out.println(a);
	}

}
