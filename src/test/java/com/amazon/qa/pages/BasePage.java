package com.qa.pages;

import net.serenitybdd.core.pages.PageUrls;
import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {

    public static void openPageWithURLTemplate(net.serenitybdd.core.pages.PageObject page, String urlTemplateName, String[] parameterValues) {

        PageUrls pageUrls = new PageUrls(page);
        page.setPageUrls(pageUrls);
        page.open(urlTemplateName, parameterValues);
    }

    public static void openPageWithAbsoluteURL(net.serenitybdd.core.pages.PageObject page, String absoluteURL) {

        PageUrls pageUrls = new PageUrls(page);
        page.setPageUrls(pageUrls);
        page.openUrl(absoluteURL);
    }
}
