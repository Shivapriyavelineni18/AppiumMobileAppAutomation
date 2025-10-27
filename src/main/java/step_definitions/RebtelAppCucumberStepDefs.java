package step_definitions;

        import org.springframework.beans.factory.annotation.Autowired;

        import cucumber.api.PendingException;
        import cucumber.api.java.en.Given;
        import cucumber.api.java.en.Then;
        import cucumber.api.java.en.When;
        import generic_functions.LaunchApp;
        import workflows.CheckLastCallEntry;
        import workflows.DialNumber;
        import workflows.Registration;

//
public class RebtelAppCucumberStepDefs {

    // Autowiring required workflow classes

    @Autowired
    LaunchApp launchApp;

    @Autowired
    Registration registration;

    @Autowired
    DialNumber dialnumber;

    @Autowired
    CheckLastCallEntry checklastentry;

    // launching Rebtel App
    @Given("^the app is open$")
    public void the_app_is_open() throws Throwable {

        LaunchApp.capabilities();
        throw new PendingException();
    }

    // Registration for new user
    @When("^user login with valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_with_valid_credentials(String userPhoneNumber, String userCountry) throws Throwable {
        // One of the the possible way to get OTP from server using API call in test environment
        String otp = "";
        registration.registerNewUser(userPhoneNumber, userCountry, otp);
    }

    // verify the default home screen for the login user
    @Then("^user navigates to the living room$")
    public void user_navigates_to_the_living_screen() throws Throwable {
        registration.inLivingRoom();
    }

    // select country and dial a number from dial pad
    @When("^user selects the \"([^\"]*)\" and call \"([^\"]*)\" from dial pad$")
    public void user_selects_the_and_call_from_dial_pad(String dialingCountry, String dialingPhonenumber)
            throws Throwable {
        dialnumber.dialNumber(dialingPhonenumber, dialingCountry);
        dialnumber.callEnd();
    }


    // verifying the last call entry
    @Then("^user can verify the call \"([^\\\"]*)\" in the living room$")
    public void user_can_verify_the_call_entry_in_the_living_room(String dialingPhonenumber) throws Throwable {
        checklastentry.lastEntryCheck(dialingPhonenumber);
    }

    // user disconnects the calls before getting connected
    @Then("^User disconnects the call before its getting connected$")
    public void user_disconnects_the_call_before_its_getting_connected() throws Throwable {
        // user disconnects the call before its getting connected
        dialnumber.callEnd();
    }

}
