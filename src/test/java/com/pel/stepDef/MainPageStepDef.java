package com.pel.stepDef;

import com.pel.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MainPageStepDef {
    MainPage mainPage = new MainPage();

    @Given("I open demoqa main page")
    public void openMainPage() {
        mainPage.openMainPage();
    }
    @When("I click on Forms card")
    public void clickFormsCard() {
        mainPage.clickFormsPage();
    }

    @When("I click on Elements card")
    public void clickElementsCard() {
        mainPage.clickElementsPage();
    }



    @When("I click on Alerts Frame & Windows card")
    public void clickAlertsFrameWindowsCard() {
        mainPage.clickAlertsFrameWindowsPage();
    }

    @When("I click on Widgets card")
    public void clickWidgetsCard() {
        mainPage.clickWidgetsPage();
    }

    @When("I click on Interactions card")
    public void clickInteractionsCard() {
        mainPage.clickInteractionsPage();
    }

    @When("I click on Book Store Application card")
    public void clickBookStoreCard() {
        mainPage.clickBookStorePage();
    }
}
