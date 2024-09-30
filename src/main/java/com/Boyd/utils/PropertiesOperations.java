package com.Boyd.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesOperations {
	public static Properties prop=new Properties();
	public static String getPropertyValueByKey(String Key) throws Exception
	{
		//loading propertiesfile
		String propertiesFilePath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream fis=new FileInputStream(propertiesFilePath);
		prop.load(fis);
		
		//reading propertiesfile
		String value=prop.get(Key).toString();
		if(value.isEmpty())
		{
			throw new Exception("value is null for "+Key);
		}
		return value;
		
		
	
		
	}

}
