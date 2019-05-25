package com.test.hooks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hooks extends BaseClass {

	@Before("@Hooks")
	public void launchApp() throws Exception {
		driverInitialization();
	}

	@After("@Hooks")
	public void closeApp() {
		driver.quit();
		service.stop();
	}
}
