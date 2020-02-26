package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class BaseTest extends Utils {
        BrowserSelector browserSelector = new BrowserSelector();

        @BeforeTest
        public void setUp() {
            browserSelector.openBrowser();

        }
    }