package com.api.booker;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;

public class HeaderExample {
	
	@Test(enabled=false)
	public void example1()
	{
		given()
		 .log()
		 .all()
		 .header("header1", "value1")
		 .header("header2", "value2","value3")
		.when()
			.get();
		
		
	}
	
	@Test(enabled=false)
	public void example2()
	{
		Header header1 = new Header("header1","value1");
		Header header2 = new Header("header2","value2");
		given()
		 .log()
		 .all()
		 .header(header1)
		 .header(header2)
		.when()
			.get();
		
	}
	
	@Test(enabled=false)
	public void example3()
	{
		
		given()
		 .log()
		 .all()
		 .headers("header1", "value1","header1","value3", "header2","value2")
		.when()
			.get();
		
		
	}
	
	@Test(enabled=false)
	public void example4()
	{
		//Recommended way of passing headers
		
		Map<String,String> values = new HashMap<>();
		values.put("h1", "v1");
		values.put("h2", "v2");
		values.put("h3", "v3");
		given()
		 .log()
		 .all()
		 .headers(values)
		.when()
			.get();
		
		
	}
	
	@Test(enabled=true)
	public void example5()
	{
		List<Header> allHeaders = new ArrayList<Header>();
		allHeaders.add(new Header("h1","v1"));
		allHeaders.add(new Header("h2","v2"));
		allHeaders.add(new Header("h2","v3"));
		
		Headers headers = new Headers(allHeaders);
		
		given()
		 .log()
		 .all()
		 .headers(headers)
		.when()
			.get();
		
		
	}
	
	

}
