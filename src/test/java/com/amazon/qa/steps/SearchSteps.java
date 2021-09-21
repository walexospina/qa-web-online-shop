package com.amazon.qa.steps;

import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.MainMenuOptions;
import com.amazon.qa.pages.SearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    HomePage homePage;
    MainMenuOptions mainMenuOptions;
    SearchResultPage searchResultPage;

    @Step
    public SearchSteps searchItemSteps(String item) {
        mainMenuOptions.searchItem(item);
        searchResultPage.isPresent();
        searchResultPage.shouldContainItemText(item);
        return this;
    }

    @Step
    public SearchSteps clickOnTheFirstImageOnResultsStep() {
        searchResultPage.clickOnFirsImageOnResultList();
        return this;
    }
}
