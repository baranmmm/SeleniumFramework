package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchTextbox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    public void goToTopMenuOption(String topMenuOption){
        driver.findElement(By.xpath("//a[.='"+topMenuOption+"']")).click();
    }

    public void searchForAnItem(String searchItem){
        searchTextbox.sendKeys(searchItem);
        searchButton.click();


    }

}


