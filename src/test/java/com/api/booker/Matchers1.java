package com.api.booker;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Matchers1 {
	
	@Test(enabled=false)
	public void matchers1()
	{
		RestAssured
			.given()
				.baseUri("https://restful-booker.herokuapp.com/booking")
			.when()
				.get()
			.then()
				.log()
				.all()
				.body("bookingid", Matchers.hasValue(153));
				
		
		//JsonPath jpath = new JsonPath(vresponse);
		
		//System.out.println(vresponse);
		
		//System.out.println("Size is "+jpath.getList("").size());
		
		//System.out.println(jpath.getList("findAll{it.bookingid <= 500}.bookingid"));
		
		
	}
	
	@Test(enabled=false)
	public void matchers2()
	{
		 RestAssured
			.given()
				.baseUri("https://api.zippopotam.us/us/33169")
			.when()
				.get()
			.then()
				.log()
				.all()
				//.extract()
				//.asString();
				.body("places.state",Matchers.contains("Florida"))
				.body("places.latitude",Matchers.contains("25.9286"));
		 		
		
		//JsonPath jpath = new JsonPath(info);
		
		//System.out.println(jpath.getMap("places[0]").get("latitude"));
	}
	
	@Test
	public void matchers3()
	{
		 RestAssured
			.given()
				.baseUri("http://universities.hipolabs.com/search?country=United+States")
			.when()
				.get()
			.then()
				//.log()
				//.all()
				//.extract()
				//.asString();
			.body("domains", Matchers.anything("[lindenwood.edu]"));
		
		//JsonPath jpath = new JsonPath(response);
		
		//System.out.println(jpath.getList("name").contains("Lindenwood University"));
	}

}
