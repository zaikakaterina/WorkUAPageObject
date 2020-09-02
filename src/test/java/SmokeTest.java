import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome = true,
features = {"src/test/resources/Apply_for_job.feature"
}, glue = "StepsDefinition")
public class SmokeTest {
}
