package com.pel.stepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;

import static com.pel.foundation.Browsers.getPlaywright;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.pel.stepDef",
        plugin = {"pretty"})
public class CucumberTest {
    @AfterEach
    public void tearDown() {
        getPlaywright().close();
    }
}
