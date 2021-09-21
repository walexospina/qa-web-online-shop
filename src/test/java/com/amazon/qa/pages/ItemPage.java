package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ItemPage extends BasePage{

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

    MainContainer mainContainer;

    public ItemPage isPresent() {
        productTitle.waitUntilVisible();
        productImage.waitUntilVisible();
        customerReviews.isVisible();
        addToCartButton.isClickable();

        mainContainer.isPresent();
        return this;
    }

    public ItemPage shouldContainMySearchedItemText(String item) {
        productTitle.containsText(item);
        productImage.containsText(item);
        amazonChoiceItemSearchedText.containsText(item);

        return this;
    }



}
