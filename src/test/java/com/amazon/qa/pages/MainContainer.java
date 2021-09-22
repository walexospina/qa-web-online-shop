package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainContainer extends BasePage {

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
    WebElementFacade mainNavegationOptions;

    @FindBy(id = "nav-cart-count-container")
    WebElementFacade myCartButton;

    public MainContainer isPresent() {
        navigationBar.waitUntilVisible();
        searchField.waitUntilVisible();
        searchButton.isClickable();
        departmentsFilter.isPresent();
        searchInputField.isPresent();
        mainNavegationOptions.isVisible();
        myCartButton.isVisible();
        return this;
    }

    public MainContainer searchItem(String item) {

        searchInputField.waitUntilEnabled().sendKeys(item);
        searchButton.click();

        return this;
    }

}
