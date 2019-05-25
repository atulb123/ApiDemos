package com.test.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.baseclass.BaseClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ViewPage extends BaseClass {
	public String webView = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));";

	@FindBy(xpath = "//*[@text='Drag and Drop']")
	private WebElement dragandDropLink;

	@FindBy(id = "drag_dot_1")
	private WebElement source;

	@FindBy(id = "drag_dot_2")
	private WebElement destination;

	@FindBy(id = "drag_result_text")
	public WebElement dragAndDropConfirmationText;

	public ViewPage(AppiumDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public ViewPage clickDragandDrop() {
		wait.until(ExpectedConditions.visibilityOf(dragandDropLink)).click();
		return this;
	}

	public ViewPage performDragandDrop() {
		action.longPress(driver.findElement(By.id("drag_dot_1"))).moveTo(driver.findElement(By.id("drag_dot_2")))
				.release().perform();
		return this;
	}
}
