package com.finalAutomation.testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@ToTest"},
        glue = "com.finalAutomation"
)
public class ToTestRunner {
}
