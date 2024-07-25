package BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/BDD/",
        plugin = {"pretty", "json:target/cucumber.json"},
        tags = "@SuccessToLogin"
)

public class TestRunner extends BaseSetUp{
}

