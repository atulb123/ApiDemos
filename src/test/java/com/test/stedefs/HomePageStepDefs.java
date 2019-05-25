package com.test.stedefs;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.test.baseclass.BaseClass;
import com.test.pages.HomePage;
import com.test.pages.ViewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

public class HomePageStepDefs extends BaseClass {
	private HomePage homePage = new HomePage(driver);
	private ViewPage viewPage = new ViewPage(driver);

	@When("^I tap on views$")
	public void i_tap_on_views() throws Throwable {
		homePage.clickAppIcon();
	}

	@Then("^I should see webview is displayed$")
	public void i_should_see_webview_is_displayed() throws Throwable {
		Assert.assertTrue("webview link is not displayed",
				driver.findElementByAndroidUIAutomator(viewPage.webView).isDisplayed());
	}

	@When("^I tap on drag and drop icon$")
	public void i_tap_on_drag_and_drop_icon() throws Throwable {
		viewPage.clickDragandDrop();
	}

	@When("^I perform drag and drop$")
	public void i_perform_drag_and_drop() throws Throwable {
		viewPage.performDragandDrop();
	}

	@Then("^I should see drag and drop performed successfully$")
	public void i_should_see_drag_and_drop_performed_successfully() throws Throwable {
		Assert.assertTrue("webview link is not displayed",
				wait.until(ExpectedConditions.visibilityOf(viewPage.dragAndDropConfirmationText)).isDisplayed());
	}
}
