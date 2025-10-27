package generic_functions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {

		AndroidDriver<AndroidElement> driver;

		// Initializing desired capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Setting up mobile capabilities
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		capabilities.setCapability("appPackage", "com.rebtel.android");
		capabilities.setCapability("appActivity", "com.rebtel.android.client.verification.views.CreateUserActivity");
		capabilities.setCapability("autoGrantPermissions", true);

		// Initializing Android driver
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

}
