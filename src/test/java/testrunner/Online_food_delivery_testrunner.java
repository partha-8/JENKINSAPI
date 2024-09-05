package testrunner;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "feature",
        glue = "stepDefination",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class Online_food_delivery_testrunner {
}
