package test;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverExamples {

    @Test
    public void downloadedDriver() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.quit();
    }

    @Test
    public void webdriverManager() {
        System.setProperty("wdm.targetPath", "lib/drivers/auto/");
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();

        driver.quit();
    }

}