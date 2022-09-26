package com.pel.foundation;

import com.microsoft.playwright.Page;

import static com.pel.foundation.Browsers.getPage;

public class BasePage {
    private final Page page;

    public BasePage() {
        page = getPage();
    }
}
