package runer;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/CucumberReport",
        features = "/Users/alinardelean/IdeaProjects/USASpending.gov/fetchTask/src/main/resources/features",
        glue = "steps",
        tags = "@ReferralsPage",
        dryRun = false)

public class Runner {


}
