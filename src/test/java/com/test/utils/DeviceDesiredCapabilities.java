package com.test.utils;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
public class DeviceDesiredCapabilities {
	@SuppressWarnings("unchecked")
	public static Map<String, String> getDesiredCapabilities(String DeviceName) throws Exception {
		Gson gson = new Gson();
		Object[] ee = gson.fromJson(
				new FileReader(System.getProperty("user.dir") + "/Capabilities/DeviceCapabilities.json"),Object[].class);
		for(Object o:ee)
		{
			if(o.toString().contains(DeviceName))
			{
				return (Map<String, String>) o;
			}
		}
		return null;
	}
}
