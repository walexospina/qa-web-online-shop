package com.qa.steps;

import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static net.serenitybdd.core.pages.PageObject.withParameters;

public class HomeSteps extends ScenarioSteps {
    HomePage homePage;

    @Step
    public HomeSteps openAmazonPageStep() {
            BasePage.openPageWithAbsoluteURL(homePage, "amazon.spain" );
        return this;
    }
}
