package widgets;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

//This class contains Elements/Object identifiers of Dial pad 
public class DialPad {

    @AndroidFindBy(id = "dialpadPhoneText")
    private MobileElement dialpad;

    @AndroidFindBy(id = "callButton")
    private MobileElement callButton;

    @AndroidFindBy(id = "countrySelectorLayout")
    private MobileElement dailpadCountrySelect;

    @AndroidFindBy(id = "actionBarSearch")
    private MobileElement countrySearchButton;

    @AndroidFindBy(id = "countryName")
    private MobileElement countryName;

    @AndroidFindBy(id = "hangupButton")
    private MobileElement endCall;

    @AndroidFindBy(id = "close")
    private MobileElement dialPadClose;

    public MobileElement getDialpad() {
        return dialpad;
    }

    public MobileElement getCallButton() {
        return callButton;
    }

    public MobileElement getEndCall() {
        return endCall;
    }

    public MobileElement getdialPadClose() {
        return dialPadClose;
    }

    public MobileElement getDailpadCountrySelect() {
        return dailpadCountrySelect;
    }

    public MobileElement getCountrySearchButton() {
        return countrySearchButton;
    }

    public MobileElement getCountryName(String country) {
        return countryName;
    }

    public MobileElement getDialPadClose() {
        return dialPadClose;
    }
}

