package com.api.deserialization;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.path.json.JsonPath;

public class ConvertJsonResponseToList {
	
	@Test
	public void jsonResponseToList()
	{
		List<Map<String,Object>> response = RestAssured
				.get("https://run.mocky.io/v3/a546da2e-9dff-454b-bf98-00a48e3f9050")
				.as(new TypeRef<List<Map<String,Object>>>(){});
		
		Iterator<Map<String,Object>> itr = response.iterator();
		
		while(itr.hasNext())
		System.out.println(itr.next());
		
		System.out.println("=========================");
		
		String response1 = RestAssured
									.get("https://run.mocky.io/v3/a546da2e-9dff-454b-bf98-00a48e3f9050")
								.then()
								 	.extract()
								 	.asString();
		
		JsonPath jpath = new JsonPath(response1);
		System.out.println(jpath.getList("findAll{it.first_name=='Anish'}"));
								
			
				
	}

}
