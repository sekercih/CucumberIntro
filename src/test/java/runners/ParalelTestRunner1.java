package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        plugin={"html:target/Pcucumber-reports1.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        glue = "stepdefinitions",
        tags = "@paralel1",
        dryRun = false
)
public class ParalelTestRunner1 {
}
