package com.pel.stepDef.forms;

import com.pel.pages.forms.FormsPage;
import io.cucumber.java.en.When;

public class FormsPageStepDef {
    FormsPage formsPage = new FormsPage();

    @When("I click on Practice Form")
    public void clickPracticeForm() {
        formsPage.clickPracticeForm();
    }
}
