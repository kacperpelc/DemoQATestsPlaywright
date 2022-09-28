package com.pel.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.pel.foundation.BasePage;
import com.pel.foundation.Constants;


import static com.pel.foundation.Browsers.*;

public class MainPage extends BasePage {
    private final Page page = getPageFirstTime();

    Locator elementsPage = page.locator("xpath=//h5[contains(text(), 'Elements')]//ancestor::div[contains(@class, 'top-card')]");
    Locator formsPage = page.locator("xpath=//h5[contains(text(), 'Forms')]//ancestor::div[contains(@class, 'top-card')]");
    Locator alertsFrameWindowsPage = page.locator("xpath=//h5[contains(text(), 'Alerts, Frame & Windows')]//ancestor::div[contains(@class, 'top-card')]");
    Locator widgetsPage = page.locator("xpath=//h5[contains(text(), 'Widgets')]//ancestor::div[contains(@class, 'top-card')]");
    Locator interactionsPage = page.locator("xpath=//h5[contains(text(), 'Interactions')]//ancestor::div[contains(@class, 'top-card')]");
    Locator bookStorePage = page.locator("xpath=//h5[contains(text(), 'Book Store Application')]//ancestor::div[contains(@class, 'top-card')]");


    public void openMainPage() {
        page.navigate(Constants.DEMOQA_URL);
    }

    public void clickElementsPage() {
        elementsPage.click();
    }

    public void clickFormsPage() {
        formsPage.click();
    }

    public void clickAlertsFrameWindowsPage() {
        alertsFrameWindowsPage.click();
    }

    public void clickWidgetsPage() {
        widgetsPage.click();
    }

    public void clickInteractionsPage() {
        interactionsPage.click();
    }

    public void clickBookStorePage() {
        bookStorePage.click();
    }
}
