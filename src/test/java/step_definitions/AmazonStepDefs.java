package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.CommonSteps;
import utilities.ConfigurationReader;

public class AmazonStepDefs extends CommonSteps {

    @Given("the user navigates to amazon website")
    public void the_user_navigates_to_amazon_website() {
        driver.get(ConfigurationReader.get("url"));
        amazonHomePage.acceptCookiesButton.click();
    }

    @When("the user searches for {string}")
    public void the_user_searches_for(String searchItem) {
        amazonHomePage.searchForAnItem(searchItem);
    }


}
