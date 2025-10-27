package workflows;

import generic_functions.LaunchApp;
import generic_functions.TouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import widgets.AppLaunchPage;
import widgets.DialPad;
import widgets.LivingRoom;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

//This class defines  methods to perform Registration for new user 

public class Registration {

	// Autowiring required class objects

	@Autowired
	DialPad dialpad;

	@Autowired
	AppLaunchPage appLaunchPage;

	@Autowired
	LivingRoom livingRoom;

	@Autowired
	TouchActions touchAction;

	// This method defines new user registration
	public void registerNewUser(String phoneNumber, String country, String otp) throws MalformedURLException {

		appLaunchPage.getGetStartedButton().click();

		appLaunchPage.getCountrySelection().click();

		dialpad.getCountrySearchButton().click();

		AndroidDriver<AndroidElement> driver = LaunchApp.capabilities();

		touchAction.swipeToText(driver, country);

		appLaunchPage.getEnterNumber().sendKeys(phoneNumber);

		appLaunchPage.getContinueButton().click();

		appLaunchPage.getEnterOTP().sendKeys(otp);

	}

	// This method verify living rooms as default home screen
	public void inLivingRoom() {
		Assert.assertTrue("login is  sucessful", livingRoom.getDialPadButton().isDisplayed());

	}

}
