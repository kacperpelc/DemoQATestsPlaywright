package com.pel.stepDef;

import com.pel.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MainPageStepDef /*extends CucumberTest */{
    MainPage mainPage = new MainPage();

    /*@Test
    public void mainPageTest() {
        mainPage.openMainPage();
        mainPage.clickBookStorePage();
    }*/

    @Given("I open demoqa main page")
    public void openMainPage() {
        mainPage.openMainPage();
    }

    @Then("I click book store page card")
    public void clickBookStorePage() {
        mainPage.clickBookStorePage();
    }
}
