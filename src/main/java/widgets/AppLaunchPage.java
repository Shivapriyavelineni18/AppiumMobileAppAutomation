package widgets;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

// This class contains Elements/Object identifiers of App launch page
public class AppLaunchPage {

	@AndroidFindBy(id = "getStartedButton")
	private MobileElement getStartedButton;

	@AndroidFindBy(id = "inputPhoneNumber")
	private MobileElement enterNumber;

	@AndroidFindBy(id = "countrySelectorLayout")
	private MobileElement countrySelection;

	@AndroidFindBy(id = "verifyButton")
	private MobileElement continueButton;

	@AndroidFindBy(id = "sms_code_number")
	private MobileElement enterOTP;

	@AndroidFindBy(id = "accept")
	private MobileElement acceptButton;

	public MobileElement getGetStartedButton() {
		return getStartedButton;
	}

	public MobileElement getCountrySelection() {
		return countrySelection;
	}

	public MobileElement getAcceptButton() {
		return acceptButton;
	}

	public MobileElement getEnterNumber() {
		return enterNumber;
	}

	public MobileElement getEnterOTP() {
		return enterOTP;
	}

	public MobileElement getContinueButton() {
		return continueButton;
	}
}
