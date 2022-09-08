package com.api.booker;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPath3 {
	
	@Test
	public void jsonPath()
	{
		String jsonObj = "[\r\n" + 
				"  {\r\n" + 
				"    \"firstName\": \"amod\",\r\n" + 
				"    \"lastName\": \"mahajan\",\r\n" + 
				"    \"age\": 28,\r\n" + 
				"    \"address\": [\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Benagluru\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city1\": \"Delhi1\",\r\n" + 
				"        \"country1\": \"India1\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  },\r\n" + 
				"  {\r\n" + 
				"    \"firstName\": \"Mukesh\",\r\n" + 
				"    \"lastName\": \"Otwani\",\r\n" + 
				"    \"age\": 31,\r\n" + 
				"    \"address\": [\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Bhopal\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"city\": \"Delhi\",\r\n" + 
				"        \"country\": \"India\"\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"]";
		
		JsonPath jpath = new JsonPath(jsonObj);
		
		System.out.println(jpath.getList("").size());
		
		//System.out.println((Object)jpath.get("address.city"));
		
		//System.out.println((Object)jpath.get("[1].address.city"));
		
		//System.out.println(jpath.getMap("[0].address[0]").size());
		
		System.out.println(jpath.getString("[1].firstName"));
	}

}
