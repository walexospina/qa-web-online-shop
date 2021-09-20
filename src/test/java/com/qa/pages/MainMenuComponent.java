package com.qa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainMenuComponent extends BasePage{
    @FindBy(id = "nav-main")
    WebElementFacade mainMenu;

    public MainMenuComponent isPresent() {
        mainMenu.waitUntilVisible();
        return this;
    }
}
