package com.amazon.qa.steps;

import com.amazon.qa.pages.ItemPage;
import com.amazon.qa.pages.MainContainer;
import com.amazon.qa.pages.ResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {

    MainContainer mainContainer;
    ResultPage resultPage;
    ItemPage itemPage;

    @Step
    public SearchSteps searchItemSteps(String item) {
        mainContainer.searchItem(item);
        resultPage.isPresent();
        resultPage.shouldContainItemText(item);
        return this;
    }

    @Step
    public SearchSteps selectFirstImageOnResultsStep(String item) {
        itemPage = resultPage.clickOnFirsImageOnResultList();
        itemPage.isPresent();

        itemPage.shouldContainMySearchedItemText(item);

        return this;
    }
}
