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

public class StepDefinitionss {

public WebDriver driver;
public SearchProduct searchprd;

    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchprd = new SearchProduct(driver);
    }
    @When("User navigate to url {string}")
    public void user_navigate_to_url(String url) {
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    @And("User Enter product name is {string}")
    public void user_enter_product_name_is(String prdtype) {
        searchprd.Enterproductname(prdtype);
    }
    @And("User Click on Searh button")
    public void user_click_on_searh_button() {
        searchprd.ClickSearchbtn();
    }
    @Then("User Close the browser")
    public void user_close_the_browser() {
     driver.close();
    }
}
