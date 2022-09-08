package com.api.booker;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Matchers2 {
	
	@Test
	public void ageMatchers()
	{
		String response = RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://date.nager.at/api/v2/publicholidays/2020/US")
			.when()
				.get()
			.then()
				.log()
				.all()
				.extract()
				.asPrettyString();
				//.body("localName", Matchers.hasItem("Presidents Day"));
		
		JsonPath jpath = new JsonPath(response);
		//System.out.println(jpath.getList("counties"));
		
		System.out.println(jpath.getList("findAll{it.localName=='Presidents Day' | it.localName=='Good Friday'}.name"));
				
				
	}

}
