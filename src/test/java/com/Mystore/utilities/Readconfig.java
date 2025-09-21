package com.Mystore.utilities;

import java.io.FileInputStream;	
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties properties;
	String path = "D:\\Eclipse\\Mystore\\MyStoreV1\\Configuration\\config.properties";
	
	public Readconfig() 
	{
		try {
		properties = new Properties();
		FileInputStream fs;
		
			fs = new FileInputStream(path);
			properties.load(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public  String getbaseurl()
	{
		String value =properties.getProperty("baseurl");
		if(value != null)
			return value;
		else
			throw new RuntimeException("The URL is not in confog file");
		}
	public String getbrowser() {
		String value =properties.getProperty("baseurl");
		if(value != null)
			return value;
		else
			throw new RuntimeException("The URL is not in confog file");
		}
	
}
