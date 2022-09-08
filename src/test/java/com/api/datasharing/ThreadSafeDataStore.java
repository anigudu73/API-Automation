package com.api.datasharing;

import java.util.LinkedHashMap;

public class ThreadSafeDataStore {
	
	private ThreadSafeDataStore()
	{
		
	}
	
	private static ThreadLocal<LinkedHashMap<String,Object>> map = ThreadLocal.withInitial(() -> new LinkedHashMap<String,Object>());
	
	public static void setData(String key , Object Value)
	{
		map.get().put(key, Value);
	}
	
	public static Object getData(String key)
	{
		return map.get().get(key);
	}
	

}
