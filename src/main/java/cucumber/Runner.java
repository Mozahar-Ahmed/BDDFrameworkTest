package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/main/java/cucumber/features"},
        glue = {"cucumber/stepDef"},
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json",
                "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
                "junit:target/cucumber-results.xml"})

public class Runner extends AbstractTestNGCucumberTests {
}
