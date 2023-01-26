package StepDefinition;

import PageObject.SearchProduct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StepDefinitionss1 {

public WebDriver driver;
public SearchProduct searchprd;

    @Given("User launch chrome browser1")
    public void user_launch_chrome_browser1() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchprd = new SearchProduct(driver);
    }
    @When("User navigate to url1 {string}")
    public void user_navigate_to_url1(String url) {
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @And("User Enter product name1 is {string}")
    public void user_enter_product_name1_is(String prdtype) {
        searchprd.Enterproductname(prdtype);
    }
    @And("User Click on Searh button1")
    public void user_click_on_searh_button1() {
        searchprd.ClickSearchbtn();
    }
    @Then("User Close the browser1")
    public void user_close_the_browser1() {
     driver.close();
    }
}
