package com.pel.stepDef.forms;

import com.pel.pages.forms.practiceForm.PracticeForm;
import io.cucumber.java.en.When;

public class PracticeFormPageStepDef {
    PracticeForm practiceForm = new PracticeForm();

    @When("I write {string} in First Name input")
    public void writeFirstName(String text) {
        practiceForm.writeInFirstName(text);
    }

    @When("I write {string} in Last Name input")
    public void writeLastName(String text) {
        practiceForm.writeInLastName(text);
    }

    @When("I write {string} in Email input")
    public void writeEmail(String text) {
        practiceForm.writeInUserEmail(text);
    }

    @When("I write {string} in Mobile Number input")
    public void writeMobile(String text) {
        practiceForm.writeInMobile(text);
    }
}
