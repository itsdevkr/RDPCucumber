package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/demo.feature",
				 glue= {"stepDefinition"},
				 plugin= {"html:Report/Cucumber-Html-Report.html",
						 "json:Report/Cucumber.json",
						 "usage:report/Cucumber-Usage.json",
						 "junit:Report/Cucumber-JUnit.xml"})

public class SearchFlightRunner {

}
