package com.amazon.qa.steps;

import com.amazon.qa.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ConversionSteps extends ScenarioSteps {

    ItemPage itemPage;
    CartPage cartPage;

    @Step
    public ConversionSteps addItemToCartStep() {
        itemPage.clickAddCartButton();
        itemPage.warrantyNoThankYou();

        return this;
    }

    @Step
    public ConversionSteps openCartPageAfterStep() {
        BasePage.openPageWithAbsoluteURL(cartPage, cartPage.AMAZON_SPAIN__CART_URL);
        cartPage.isPresent();
        return this;
    }

    @Step
    public ConversionSteps myItemShouldBeOnMyCartStep(String item) {
        cartPage.isPresent();
        cartPage.shouldContainItemText(item);
        return this;
    }


}
