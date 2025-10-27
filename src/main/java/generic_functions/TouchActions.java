package generic_functions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

// This class deals Reusable  generic touch action
public class TouchActions {

	public void swipeToText(AndroidDriver<AndroidElement> driver, String country) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(" + country + "));");
	}

}
