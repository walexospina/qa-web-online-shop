package com.qa.scenario_steps;

import com.qa.steps.HomeSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class HomeScenarioSteps {

    @Steps
    HomeSteps homeSteps;

    @Given("I am in amazon web site")
    public void i_am_in_amazon_web_site() {
        homeSteps.openAmazonPageStep();
    }

}
