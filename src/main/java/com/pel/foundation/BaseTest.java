package com.pel.foundation;

import org.junit.jupiter.api.AfterEach;

import static com.pel.foundation.Browsers.getPlaywright;

public class BaseTest {
    @AfterEach
    public void tearDown() {
        getPlaywright().close();
    }
}
