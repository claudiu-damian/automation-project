import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/features/AddToCart.feature"},
        //tags = "@Claudiu",
        glue = {"steps"}
)

public class CucumberRunner {
}
