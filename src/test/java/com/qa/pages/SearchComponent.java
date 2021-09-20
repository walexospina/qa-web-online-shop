package com.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class SearchComponent  extends BasePage {

    @FindBy(id = "nav-search")
    WebElementFacade searchField;

    @FindBy(className = "twotabsearchtextbox")
    WebElementFacade searchInputField;

    @FindBy(id = "nav-search-submit-button")
    WebElementFacade searchButton;

    @FindBy(id = "nnav-search-bar-internationalization-key")
    WebElementFacade departmentsfilter;

    public SearchComponent isPresent() {
        searchField.waitUntilVisible();
        searchButton.isClickable();
        departmentsfilter.isPresent();
        return this;
    }
}
