package workflows;

import generic_functions.LaunchApp;
import generic_functions.TouchActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import widgets.DialPad;
import widgets.LivingRoom;

import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;

public class DialNumber {

	// Autowiring required class objects

	@Autowired
	LivingRoom livingRoom;

	@Autowired
	DialPad dialPad;

	@Autowired
	TouchActions touchAction;

	public void dialNumber(String callingNumber, String country) throws MalformedURLException, InterruptedException {

		livingRoom.getDialPadButton().click();

		dialPad.getDailpadCountrySelect().click();

		AndroidDriver<AndroidElement> driver = LaunchApp.capabilities();

		touchAction.swipeToText(driver, country);

		dialPad.getCountryName(country).click();

		dialPad.getDialpad().sendKeys(callingNumber);

		dialPad.getCallButton().click();

		// wait until the duration time equals 10 seconds
		// This can be replaced with wait until() till the call timer starts , For time being I put harde code wait time
		wait(10);
	}

	// This method is to end call and click on close button to go back to living room in app
	public void callEnd() {
		dialPad.getEndCall().click();

		dialPad.getDialPadClose().click();
	}
}
