package com.api.booker;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonFilter {
	
	@Test(enabled=false)
	public void filterJson1()
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\People1.json";
		//System.out.println(path);
		
		File jsonfile = new File(path);
		
		JsonPath jpath = new JsonPath(jsonfile);
		
		System.out.println(jpath.getList("").size());
		
		//System.out.println(jpath.getList("findAll{it.gender == 'Female'}.first_name"));
		
		//System.out.println(jpath.getList("findAll{it.gender == 'Male'}.first_name"));
		
		//System.out.println(jpath.getString("find{it.first_name == 'Shellie' & it.last_name == 'Cowser'}.email"));
		
		System.out.println(jpath.getList("findAll{it.first_name == 'Sharl' | it.first_name == 'Merrili'}.email"));
	}
	
	@Test
	public void filterJson2()
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\People2.json";
		
		File jsonfile = new File(path);
		
		JsonPath jpath = new JsonPath(jsonfile);
		
		System.out.println(jpath.getList("data").size());
		
		//System.out.println(jpath.getList("data.findAll{it.gender == 'Male'}.first_name"));
		//System.out.println(jpath.getList("data.first_name"));
		
		System.out.println(jpath.getMap("data[1]"));
		
		System.out.println(jpath.getList("data.findAll{it.id >= 4 & it.id <= 8}.email"));
	}
	

}
