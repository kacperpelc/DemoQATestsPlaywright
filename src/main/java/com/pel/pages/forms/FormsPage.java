package com.pel.pages.forms;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.pel.foundation.BasePage;
import com.pel.foundation.Browsers;

public class FormsPage extends BasePage {
    private final Page page = Browsers.getPage();
    Locator practiceForm = page.locator("xpath=//span[contains(text(), 'Practice Form')]//parent::li");

    public void clickPracticeForm() {
        practiceForm.click();
    }
}
