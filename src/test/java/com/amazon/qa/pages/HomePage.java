package com.qa.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class HomePage extends BasePage{

        public static final String AMAZON_SPAIN_URL = "https://www.amazon.es";

        @FindBy(className = "a-carousel-goto-prevpage")
        WebElementFacade amazonProductsCarousel;

        @FindBy(id = "desktop-1")
        WebElementFacade offersFirstCarousel;

        @FindBy(id = "navFooter")
        WebElementFacade footer;

        @FindBy(id = "nav-link-accountList")
        WebElementFacade accountLink;

        @FindBy(className = "gw-card-layout")
        List<WebElementFacade> amazonProductsCards;

        MainMenuOptions mainMenuOptions;

        public HomePage isPresent() {
                amazonProductsCarousel.waitUntilVisible();
                offersFirstCarousel.isPresent();
                footer.isVisible();
                accountLink.isPresent();

                mainMenuOptions.isPresent();
                return this;
        }

}
