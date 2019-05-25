package com.test.baseclass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.utils.DeviceDesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	public static AndroidDriver driver;
	public static WebDriverWait wait;
	public static AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	public static DesiredCapabilities dc;
	public static TouchAction action;

	public void driverInitialization() throws Exception {
		service.start();
		dc = new DesiredCapabilities(
				DeviceDesiredCapabilities.getDesiredCapabilities("Moto E3 POWER"));
		driver = new AndroidDriver(service.getUrl(), dc);
		wait = new WebDriverWait(driver, 10);
		action = new TouchAction(driver);
	}
}
