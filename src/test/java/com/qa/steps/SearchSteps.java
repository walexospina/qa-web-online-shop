package com.qa.steps;

import com.qa.pages.HomePage;
import com.qa.pages.MainMenuOptions;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchSteps extends ScenarioSteps {
    HomePage homePage;
    MainMenuOptions mainMenuOptions;
    @Step
    public SearchSteps searchItemSteps(String item) {
        mainMenuOptions.searchItem(item);

        return this;
    }
}
