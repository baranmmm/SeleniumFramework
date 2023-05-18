package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.CommonSteps;

public class SearchResultsStepDefs extends CommonSteps {

    @And("the user clicks on the {int}. result")
    public void theUserClicksOnTheResult(int nThResult) {
        searchResultsPage.clickOnNthSearchResult(nThResult);
    }

    @Then("the page title should contain product title")
    public void thePageTitleShouldContainProductTitle() {
        String pageTitle = driver.getTitle();
        String productTitle = searchResultsPage.productTitle.getText();
        Assert.assertTrue(pageTitle.contains(productTitle));
    }
}
