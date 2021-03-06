package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ItemPage extends BasePage{

    private static final String warrantyPopUp = "attachSiAddCoverage";

    @FindBy(id = "productTitle")
    WebElementFacade productTitle;

    @FindBy(id = "imgTagWrapperId")
    WebElementFacade productImage;

    @FindBy(id = "averageCustomerReviews_feature_div")
    WebElementFacade customerReviews;

    @FindBy(className = "ac-keyword-link")
    WebElementFacade amazonChoiceItemSearchedText;

    @FindBy(id = "add-to-cart-button")
    WebElementFacade addToCartButton;

    @FindBy(id = "buy-now-button")
    WebElementFacade buyNowButton;

    @FindBy(id = "attach-sidesheet-view-cart-button-announce")
    WebElementFacade goToCartPageButton;


    @FindBy(xpath = "//*[@id='attachSiNoCoverage']//*[contains(@class, 'a-button-input')]")
    WebElementFacade warrantyPopUpNoThankYouButton;

    MainContainer mainContainer;

    public ItemPage isPresent() {
        productTitle.waitUntilVisible();
        productImage.waitUntilVisible();
        customerReviews.isVisible();
        addToCartButton.isClickable();
        buyNowButton.isClickable();

        mainContainer.isPresent();
        return this;
    }

    public ItemPage shouldContainMySearchedItemText(String item) {
        productTitle.containsText(item);
        productImage.containsText(item);
        amazonChoiceItemSearchedText.containsText(item);

        return this;
    }

    public ItemPage clickAddCartButton() {
        addToCartButton.waitUntilClickable().click();

        fluentWaitForElementToBeVisible(By.id(warrantyPopUp), 3);
        return this;
    }

    public ItemPage warrantyNoThankYou() {
        warrantyPopUpNoThankYouButton.waitUntilPresent().click();
        goToCartPageButton.waitUntilVisible();
        return this;
    }



}
