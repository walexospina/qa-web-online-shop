package com.amazon.qa.pages;

import net.serenitybdd.core.pages.PageUrls;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage extends PageObject {


    public static void openPageWithAbsoluteURL(net.serenitybdd.core.pages.PageObject page, String absoluteURL) {

        PageUrls pageUrls = new PageUrls(page);
        page.setPageUrls(pageUrls);
        page.openUrl(absoluteURL);
    }

    protected boolean allElementsVisible(List<WebElementFacade> elementFacadeList) {
        for (WebElementFacade element : elementFacadeList) {
            if (!element.isVisible()) {
                return false;
            }
        }
        return true;
    }

    protected boolean allElementsClickable(List<WebElementFacade> elementFacadeList) {
        for (WebElementFacade element : elementFacadeList) {
            if (!element.isClickable()) {
                return false;
            }
        }
        return true;
    }

    protected void fluentWaitForElementToBeVisible(org.openqa.selenium.By locator, int timeoutInSecons){

        WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSecons);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
