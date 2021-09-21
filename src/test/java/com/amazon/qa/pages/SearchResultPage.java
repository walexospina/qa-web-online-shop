package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(id = "search")
    WebElementFacade searchResultsPage;

    @FindBy(css = ".sg-col-inner>.a-spacing-top-small > .a-text-bold")
    WebElementFacade resultsByItemText;

    @FindBy(xpath = "//*[@data-cel-widget='search_result_0']//*[contains(@class, 'image')]")
    WebElementFacade firstElementClickableOnResultList;

    @FindBy(css = "[data-component-type='s-search-result'] ")
    List<WebElementFacade> listOfItemsResult;

    @FindBy(xpath = "//*[@data-component-type='s-search-result']//*[contains(@class, 'image')]")
    List<WebElementFacade> listImagesOnResults;


    public SearchResultPage isPresent() {
        searchResultsPage.waitUntilVisible();
        resultsByItemText.waitUntilVisible();
        this.allElementsVisible(listOfItemsResult);

        return this;
    }

    public SearchResultPage shouldContainItemText(String item) {
        resultsByItemText.containsText(item);

        return this;
    }

    public SearchResultPage clickOnFirsImageOnResultList() {
        firstElementClickableOnResultList.waitUntilClickable().click();

        return this;

    }
}