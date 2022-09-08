package com.api.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonResponseToMap {
	
	@Test
	public void JsontoMap()
	{
		Map<String,Object> response = RestAssured
			.get("https://run.mocky.io/v3/f036ddc5-e353-46f3-8b1e-0ecc69d1b333")
			.as(new TypeRef<Map<String,Object>>(){});
		
		System.out.println(response.get("email"));
		
		ArrayList<String> al = (ArrayList<String>) response.get("mobile");
		for(String obj : al)
			System.out.println(obj);
		
		@SuppressWarnings("unchecked")
		Map<String,Object> skills = (Map<String,Object>)response.get("skills");
		System.out.println(skills.get("name"));
		
		Iterator<String> itr = skills.keySet().iterator();
		
		while(itr.hasNext())
		{
			String key = itr.next();
			System.out.println("Key is "+key+" Value is "+skills.get(key));
		}
		
		Iterator<String> itr2 = response.keySet().iterator();
		
		while(itr2.hasNext())
		{
			String key = itr2.next();
			System.out.println("Key is "+key+" Value is "+response.get(key));
		}
		
		Iterator<Entry<String,Object>> itr3 = response.entrySet().iterator();
		
		while(itr3.hasNext())
		{
			Entry<String,Object> entry = itr3.next();
			System.out.println("Key is "+entry.getKey()+"Value is "+entry.getValue());
		}
		
		
			
	}

}
