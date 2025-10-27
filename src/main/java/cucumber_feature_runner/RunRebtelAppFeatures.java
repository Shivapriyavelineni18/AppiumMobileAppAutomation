package cucumber_feature_runner;

//This is  runner class for cucumber feature file

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/main/resources/features",glue="src/main/java/step_definitions")

public class RunRebtelAppFeatures {

}
