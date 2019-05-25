package com.test.utils;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;

import com.google.gson.Gson;
public class DeviceDesiredCapabilities {
	@SuppressWarnings("unchecked")
	public static Map<String, String> getDesiredCapabilities(String DeviceName) throws Exception {
		Gson gson = new Gson();
		return (Map<String, String>) Arrays.asList(gson.fromJson(
				new FileReader(System.getProperty("user.dir") + "/Capabilities/DeviceCapabilities.json"),Object[].class)).stream().filter(e->e.toString().contains(DeviceName)).findFirst().get();
	}
}
