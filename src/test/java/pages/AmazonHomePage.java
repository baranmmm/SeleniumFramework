package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePage extends CommonPageElements {

    @FindBy(id = "sp-cc-accept")
    public WebElement acceptCookiesButton;

}
