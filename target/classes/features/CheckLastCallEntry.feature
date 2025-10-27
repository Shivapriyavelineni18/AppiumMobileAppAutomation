Feature: Check the latest call entry

  Narrative:
  In order to checks the latest call entry in the Living Room
  As a user
  I logs-in to the Rebtel app, makes a call from dial pad

  # In this Scenario we are assuming that user has already registered
  Scenario Outline: Check the latest call entry
    Given the app is open
    Then user navigates to the living room
    When user selects the "<DialingCountry>" and call "<DialingPhonenumber>" from dial pad
    Then user can verify the call "<DialingPhonenumber>" in the living room

    Examples:
      | DialingPhonenumber | DialingCountry |
      | 734858797          | sweden(+46)    |


  # This Scenario is for a new user 
  # OTP verification can be done using Api request which is not handled Here
  Scenario Outline: Check the latest call entry for new user
    Given the app is open
    When user login with valid "<UserPhoneNumber>" and "<UserCountry>"
    Then user navigates to the living room
    When user selects the "<DialingCountry>" and call "<DialingPhonenumber>" from dial pad
    Then user can verify the call "<DialingPhonenumber>" in the living room

    Examples:
      | UserPhoneNumber | UserCountry | DialingPhonenumber | DialingCountry |
      | 7348508799      | sweden(+46) | 734858797          | sweden(+46)    |

  # In This Scenario we verify that only connected calls should display in the living room
  # OTP verification can be done using Api request which is not handled Here
  Scenario Outline: checking the cancelled call entry for new user (negative)
    Given the app is open
    When user login with valid "<UserPhoneNumber>" and "<UserCountry>"
    Then user navigates to the living room
    When user selects the "<DialingCountry>" and call "<DialingPhonenumber>" from dial pad
    Then User disconnects the call before its getting connected
    Then user can verify the call "<DialingPhonenumber>" in the living room

    Examples:
      | UserPhoneNumber | UserCountry | DialingPhonenumber | DialingCountry |
      | 7348508799      | sweden(+46) | 734858797          | sweden(+46)    |
