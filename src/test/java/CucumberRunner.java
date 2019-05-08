import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/features/"},
<<<<<<< HEAD
        tags = {"@Claudiu","~@wip","~@notImplemented","@sanity"},
        glue = {"steps","com.StepDefinitions"},
        dryRun = false,
        strict = true,
        monochrome = true,
        plugin = { "progress",
                "html:target/CucumberReport" }
=======
        tags = "@Andrei",
        glue = {"steps"}
>>>>>>> upstream/master
)
public class CucumberRunner {
}
