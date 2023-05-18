package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends CommonPageElements{

    @FindBy(id = "productTitle")
    public WebElement productTitle;

    public void clickOnNthSearchResult(int nthResult){
        driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-base\"])["+nthResult+"]")).click();
    }
}
