package com.amazon.qa.steps;

import com.amazon.qa.pages.ItemPage;
import com.amazon.qa.pages.MainContainer;
import com.amazon.qa.pages.ResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ConversionSteps extends ScenarioSteps {
    MainContainer mainContainer;
    ResultPage resultPage;
    ItemPage itemPage;

    @Step
    public ConversionSteps clickOnAddCartStep() {
        itemPage.clickAddCartButton();
        return this;
    }
}
