package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(id = "search")
    WebElementFacade searchResultsPage;

    @FindBy(css = ".sg-col-inner>.a-spacing-top-small > .a-text-bold")
    WebElementFacade resultsByItemText;

    @FindBy(xpath = "//*[@data-cel-widget='search_result_0']//*[contains(@class, 'image')]")
    WebElementFacade firstElementClickableOnResultList;

    @FindBy(css = "[data-component-type='s-search-result']")
    List<WebElementFacade> listOfItemsResult;

    @FindBy(xpath = "//*[@data-component-type='s-search-result']//*[contains(@class, 'image')]")
    List<WebElementFacade> listImagesOnResults;

    ItemPage itemPage;

    public ResultPage isPresent() {
        searchResultsPage.waitUntilVisible();
        resultsByItemText.waitUntilVisible();
        this.allElementsVisible(listOfItemsResult);

        return this;
    }

    public ResultPage shouldContainItemText(String item) {
        resultsByItemText.containsText(item);

        return this;
    }

    public ItemPage clickOnFirsImageOnResultList() {
        firstElementClickableOnResultList.waitUntilClickable().click();

        return itemPage;

    }
}