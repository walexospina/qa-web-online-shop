package com.qa.pages;


import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@NamedUrls(
        {
                @NamedUrl(name = "amazon.spain", url = "https://www.amazon.es"),
                @NamedUrl(name = "amazon.usa", url = "https://www.amazon.com")
        }
)

public class HomePage extends BasePage{


}
