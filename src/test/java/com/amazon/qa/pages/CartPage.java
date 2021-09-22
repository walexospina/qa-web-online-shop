package com.amazon.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends BasePage{

    public static final String AMAZON_SPAIN__CART_URL = "https://www.amazon.es/gp/cart/view.html?ref_=nav_cart";

    @FindBy(css = "[data-feature-id='proceed-to-checkout-action']")
    WebElementFacade processWithCheckoutButton;

    @FindBy(className = "a-truncate-cut")
    WebElementFacade cartItemTextTitle;

    @FindBy(className = "a-spacing-mini")
    WebElementFacade priceItem;

    MainContainer mainContainer;


    public CartPage isPresent() {
        processWithCheckoutButton.isClickable();
        priceItem.isPresent();

        mainContainer.isPresent();
        return this;
    }

    public CartPage shouldContainItemText(String item) {
        cartItemTextTitle.containsText(item);

        return this;
    }

}
