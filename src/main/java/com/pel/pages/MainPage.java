package com.pel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.pel.foundation.BasePage;


import java.nio.file.Paths;

import static com.pel.foundation.Browsers.*;

public class MainPage extends BasePage {
    private final Page page = getPageFirstTime();

    Locator bookStorePage = page.locator("xpath=//h5[contains(text(), 'Book Store Application')]//ancestor::div[contains(@class, 'top-card')]");

    public void openMainPage() {
        final String URL = "https://demoqa.com";
        page.navigate(URL);
    }

    public void clickBookStorePage() {
        bookStorePage.click();
        //page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
    }

}
