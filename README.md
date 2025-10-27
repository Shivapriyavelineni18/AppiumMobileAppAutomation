# AppiumMobileAppAutomation
In this Test Automation Project i am testing the mobile app called Rebtel

Rebtel Assignment 
Project structure:
 
_________________________________________________________________________________
Page object model and Cucumber Behavior driven development approach is used to Develop This project.  Maven was used as build tool.
Following Frameworks/Tools and programming languages used to complete this assignment:
Framework/Tools: Appium, Selenium, Eclipse, Cucumber, Maven, Junit.
Language: Java, Java Spring
_________________________________________________________________________________
Please find below brief description Class and packages in this project  
Package: cucumber_feature_runner
This package contains the runner class for cucumber
RunRebtelAppFeatures.java  : 
Helps to run cucumber feature files 

Package : generic_functions
This package contains the generic functionality classes
LaunchApp.java :
This class contains the Appium code to launch Rebtel App.  
TouchActions.java:
This class contain the touch Actions to perform in the mobile app
RunRebtelApp.java:
This is the runner class for the cucumber feature files 

Package: step_definitions
This package contain step definition class of cucumber feature file
RebtelAppCucumberStepDefs.java:
This class contain the implementation methods for cucumber scenario test steps 

Package: widgets
I followed Page Object pattern, Object identifiers/Elements under each app page are grouped in to class file.
This package contain the widget classes of each screen. 
AppLaunchPage.java:
This class contains Elements/Object identifiers of launch page
DialPad.java
This class contains Elements/Object identifiers of Dial pad 
LivingRoom.java
This class contains Elements/Object identifiers of  Living Room 

Package: workflows 
Possible user flows are defined under this package 
CheckLastCallEntry.java
Defined method to verify the last call entry
DialNumber.java
Defined methods to perform actions on dialing 
Registration.java
Defined methods to perform Registration for new user 

Feature file: CheckLastCallEntry.feature
This feature file contains both positive and negative test case scenarios to verify last entry in living room.
# In this Scenario we are assuming that user has already registered
  Scenario Outline: Check the latest call entry

# This Scenario is for a new user 
# OTP verification can be done using Api request which is not handled Here 
  Scenario Outline: Check the latest call entry for new user
# In This Scenario we verify that only connected calls should display in the living room
# OTP verification can be done using Api request which is not handled Here 
  Scenario Outline: checking the cancelled call entry for new user (negative)

Continuous Integration:
Jenkins pipeline jobs approach can be used for continuous integration.
Groovy files with Matrix jobs can be used to create Test job which integrates with Cucumber feature file to trigger cucumber feature file test as part of Continuous integration.
Optionally Cloud devices (for Example Sauce lab devices) can be used as target devices.
Basically when there is an new build was generated from the development branch which will trigger this E2E test pipeline.  
Sample code: 
matrixJob("$appFolder/Rebtel - Android - Check the latest call entry - Test")  
   testJobRebtel(<appSource>, , <targetEnv>(Test/production), " Check the latest call entry ", <Jenkins folder path >, <Target devices> )
}

