import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"progress","html:target/site/cucumber-pretty","json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/features/"},
        tags = "@Andrei",
        glue = {"project.hooks",
                "steps","com.StepDefinitions"},
        strict = true,
        monochrome = true
)

public class CucumberRunner {
}
