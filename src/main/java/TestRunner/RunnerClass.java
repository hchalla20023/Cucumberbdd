package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "D:\\Trainings\\SoftwareTesting Trainings\\Frameworks\\bdd_cucumber_ui2023\\src\\test\\java\\Features",
       glue = "StepDefinition",
       plugin = {"pretty", "html:target/cucumber-reports/CucumberReports2023.html"}
)
public class RunnerClass {

}
