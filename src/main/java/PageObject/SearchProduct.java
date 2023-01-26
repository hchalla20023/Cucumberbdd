package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
    public WebDriver driver;
    public SearchProduct(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement Searchtextbox;
@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    WebElement Searchbtn;

public void Enterproductname(String prdtype) {
    Searchtextbox.sendKeys(prdtype);
}
public void ClickSearchbtn() {
    Searchbtn.click();
   }
}