package com.qa.steps;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public HomeSteps openAmazonPageStep() {
            BasePage.openPageWithAbsoluteURL(homePage, homePage.AMAZON_SPAIN_URL);
            homePage.isPresent();
        return this;
    }
}
