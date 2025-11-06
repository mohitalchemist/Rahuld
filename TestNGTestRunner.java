package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/cucumber",glue="mohitsuyal1.stepDefinition",monochrome=true,tags= "@Regression",plugin= {"html:targer/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
