package com.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainMenuOptions extends BasePage {

    @FindBy(id = "navbar")
    WebElementFacade navigationBar;

    @FindBy(id = "nav-search")
    WebElementFacade searchField;

    @FindBy(id = "twotabsearchtextbox")
    WebElementFacade searchInputField;

    @FindBy(id = "nav-search-submit-button")
    WebElementFacade searchButton;

    @FindBy(id = "nav-search-bar-internationalization-key")
    WebElementFacade departmentsFilter;

    @FindBy(id = "nav-main")
    WebElementFacade mainMenuOptions;

    public MainMenuOptions isPresent() {
        navigationBar.waitUntilVisible();
        searchField.waitUntilVisible();
        searchButton.isClickable();
        departmentsFilter.isPresent();
        searchInputField.isPresent();
        mainMenuOptions.isVisible();
        return this;
    }

    public MainMenuOptions searchItem(String item) {


        searchInputField.waitUntilEnabled().type(item);

        return this;
    }

    public MainMenuOptions mainMenuOptionsPresent() {
        mainMenuOptions.waitUntilVisible();
        return this;
    }
}
