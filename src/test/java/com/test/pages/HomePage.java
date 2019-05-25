package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.baseclass.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseClass {

	private String views = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));";

	public HomePage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public HomePage clickAppIcon() {
		driver.findElementByAndroidUIAutomator(views).click();
		return this;
	}
}
