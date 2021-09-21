package com.amazon.qa.steps;

import com.amazon.qa.pages.BasePage;
import com.amazon.qa.pages.HomePage;
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
