package widgets;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

//This class contains Elements/Object identifiers of  Living Room 
public class LivingRoom {

    @AndroidFindBy(id = "dialpadButton")
    private MobileElement dialPadButton;

    @AndroidFindBy(id = "contactName")
    private MobileElement lastCalledNumber;


    public MobileElement getDialPadButton() {
        return dialPadButton;
    }

    public MobileElement  getLastCalledNumber() {
        return lastCalledNumber;
    }

}
