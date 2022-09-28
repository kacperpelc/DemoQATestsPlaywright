package com.pel.pages.forms.practiceForm;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.pel.foundation.Browsers;

public class PracticeForm {
    private final Page page = Browsers.getPage();

    Locator firstNameInput = page.locator("id=firstName");
    Locator lastNameInput = page.locator("id=lastName");
    Locator emailInput = page.locator("id=userEmail");
    Locator mobileInput = page.locator("id=lastName");
    Locator dateOfBirthInput = page.locator("id=dateOfBirthInput");
    Locator subjectsInput = page.locator("xpath=//div[contains(@class, 'subjects-auto-complete__value-container')]");

    /*
    @FindBy(xpath = "//label[@class='custom-control-label' and contains(text(), 'Reading')]")
    private WebElement readingCheckBox;

    @FindBy(xpath = "//label[@class='custom-control-label' and contains(text(), 'Music')]")
    private WebElement musicCheckBox;

    @FindBy(id = "uploadPicture")
    private WebElement uploadInput;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressInput;

    @FindBy(id = "state")
    private WebElement stateInput;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "submit")
    private WebElement submitButton;*/

    public void writeInFirstName(String text) {
        firstNameInput.type(text);
    }

    public void writeInLastName(String text) {
        lastNameInput.type(text);
    }

    public void writeInUserEmail(String text) {
        emailInput.type(text);
    }

    public void writeInMobile(String text) {
        mobileInput.type(text);
    }
}
