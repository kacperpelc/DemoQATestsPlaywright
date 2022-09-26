package com.pel.foundation;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class Browsers {
    private static Browser browser;
    private static Page page;
    private static Playwright playwright;


    public static void start() {
        playwright = Playwright.create();
        BrowserType chrome = playwright.chromium();
        Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
    }

    public static Page getPageFirstTime() {
        start();
        return page;
    }

    public static Page getPage() {
        return page;
    }

    public static Playwright getPlaywright() {
        return playwright;
    }
}
