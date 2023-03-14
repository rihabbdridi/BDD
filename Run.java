package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "",
features = "src/test/features/Sprint2/CreationCompteFBBDD.feature",
glue = {"Hooks","PageStepDefinition"},
publish = true,
plugin = {"pretty", "html:target/CucumberReport.html",
"json:target/CucumberReport" }
)

public class Run {

}
