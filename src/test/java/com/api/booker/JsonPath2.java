package com.api.booker;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPath2 {
	
	@Test(enabled=false)
	public void readJsonPath()
	{
		String jsonObject = "{\r\n"
				+ "  \"FirstName\":\"Anish\",\r\n"
				+ "  \"LastName\":\"Kumar\",\r\n"
				+ "  \"Company\":\"Telus\",\r\n"
				+ "  \"Gender\":\"Male\",\r\n"
				+ "  \"Address\":{\"PlotNo\":421,\r\n"
				+ "              \"Colony\":\"Bari\",\r\n"
				+ "              \"Pin\":827102\r\n"
				+ "  },\r\n"
				+ "  \"Salary\":10900.12\r\n"
				+ "  \r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(jsonObject);
		
		//System.out.println((Map)jp.get(""));
		
		//System.out.println("Plot No is "+jp.get("Address.PlotNo"));
		//System.out.println(6+4+"Plot is "+4+2);
		
		Float a = jp.getFloat("Salary");
		System.out.println(a);
		
	}
	
	@Test(enabled=false)
	public void readJsonPath2()
	{
		String jsonObject = "[\r\n"
				+ "  {\r\n"
				+ "    \"name\": \"anish\",\r\n"
				+ "    \"age\": 35,\r\n"
				+ "    \"gender\": \"M\",\r\n"
				+ "    \"married\": false,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"bokaro\",\r\n"
				+ "        \"flat\": 421\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"delhi\",\r\n"
				+ "        \"flat\": 308,\r\n"
				+ "        \"street\": 13\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"bangalore\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"name\": \"anish\",\r\n"
				+ "    \"age\": 35,\r\n"
				+ "    \"gender\": \"M\",\r\n"
				+ "    \"married\": false\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"name\": \"piyush\",\r\n"
				+ "    \"city\": \"chandigarh\"\r\n"
				+ "  },\r\n"
				+ "  \"James\",\r\n"
				+ "  8,\r\n"
				+ "  9.5\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(jsonObject);
		
		//System.out.println(jp.getMap("[0].address[1]"));
		System.out.println(jp.getList("[0].address").size());
		
		//System.out.println(jp.getBoolean("[1].married"));
		
		System.out.println(jp.getMap("[0].address[1]"));
		
		//System.out.println(jp.getString("[0].address[1]"));
	}

	@Test(enabled=true)
	public void readJsonPath3()
	{
		String jsonObject = "[\r\n"
				+ "  [\r\n"
				+ "  \"10\",\r\n"
				+ "  \"20\",\r\n"
				+ "  \"30\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"100\",\r\n"
				+ "    \"200\",\r\n"
				+ "    \"300\",\r\n"
				+ "    \"400\",\r\n"
				+ "    \"Anish\"\r\n"
				+ "  ]\r\n"
				+ "  \r\n"
				+ "]";
		
		JsonPath jpath = new JsonPath(jsonObject);
		
		//System.out.println((Object)jpath.get(""));
		//System.out.println(jpath.getList("[1]").size());
		
		System.out.println(jpath.getList("[1]").size());
	}
}
