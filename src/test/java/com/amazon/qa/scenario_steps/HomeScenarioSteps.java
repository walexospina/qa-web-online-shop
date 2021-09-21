package com.amazon.qa.scenario_steps;

import com.amazon.qa.steps.ConversionSteps;
import com.amazon.qa.steps.HomeSteps;
import com.amazon.qa.steps.SearchSteps;
import com.amazon.qa.Session;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class HomeScenarioSteps {

    @Steps
    HomeSteps homeSteps;

    @Steps
    SearchSteps searchSteps;

    @Steps
    ConversionSteps conversionSteps;

    @Given("I am in amazon web site")
    public void i_am_in_amazon_web_site() {
        homeSteps.openAmazonPageStep();
    }

    @Given("I am interesting in a {string}")
    public void i_am_interesting_in_an_item(String item) {
        Session.storeItem(item);
        searchSteps.searchItemSteps(item);
    }

    @Then("I select my favorite item to purchase")
    public void i_select_my_favorite_item_to_purchase() {
        String item = Session.getItem();

        Assert.assertNotNull(item);
        searchSteps.clickOnTheFirstImageOnResultsStep(item);

        conversionSteps.clickOnAddCartStep();


    }

}
