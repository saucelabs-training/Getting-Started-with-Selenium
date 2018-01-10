package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExamples extends Base {

    private WebDriver browser;

    @Before
    public void setup() {
        super.setup();
        browser = new ChromeDriver();
    }

    @After
    public void teardown() {
        browser.quit();
    }

    @Test
    public void openBrowser() {
    }

}