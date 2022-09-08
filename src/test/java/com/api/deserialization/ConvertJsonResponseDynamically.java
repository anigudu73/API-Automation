package com.api.deserialization;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonResponseDynamically {
	
	@Test
	public void dynamicConversion()
	{
		Object obj = RestAssured
						//.get("https://run.mocky.io/v3/a546da2e-9dff-454b-bf98-00a48e3f9050")
						.get("https://run.mocky.io/v3/f036ddc5-e353-46f3-8b1e-0ecc69d1b333")
							.as(new TypeRef<Object>(){});
		
		if(obj instanceof Map)
		{
			LinkedHashMap<String,Object> response = (LinkedHashMap<String,Object>)obj;
			System.out.println(response.keySet());
			System.out.println(response.get("first_name"));
		}
		
		else if(obj instanceof List)
		{
			ArrayList response = (ArrayList)obj;
			System.out.println(response.size());
		}
	}

}
