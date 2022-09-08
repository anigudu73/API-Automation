package com.api.datasharing;

import java.util.LinkedHashMap;

public class DataStore {
	
	private DataStore()
	{
		
	}
	
	private static LinkedHashMap<String,Object> datastore = new LinkedHashMap<>();
	
	public static void setData(String key , Object value)
	{
		datastore.put(key, value);
	}
	
	public static Object getData(String key)
	{
		return datastore.get(key);
	}

}
