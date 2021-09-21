package com.qa.scenario_steps;

import com.qa.items.Item;
import com.qa.steps.HomeSteps;
import com.qa.steps.SearchSteps;
import com.qa.utils.Session;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

    @Steps
    HomeSteps homeSteps;

    @Steps
    SearchSteps searchSteps;

    @Given("I am in amazon web site")
    public void i_am_in_amazon_web_site() {
        homeSteps.openAmazonPageStep();
    }

    @Given("I am interesting in a {string}")
    public void i_am_interesting_in_an_item(String item) {
        Session.storeItem(item);
        searchSteps.searchItemSteps(item);
    }

}
