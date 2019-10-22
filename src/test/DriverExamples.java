package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverExamples {

    @Test
    public void downloadedDriver() {
        if (System.getProperty("os.name").startsWith("Windows")) {
            System.setProperty("webdriver.firefox.driver", "lib/drivers/geckodriver.exe");
        } else {
            System.setProperty("webdriver.firefox.driver", "lib/drivers/geckodriver");
        }

        WebDriver driver = new FirefoxDriver();

        driver.quit();
    }

    @Test
    public void webdriverManager() {
        System.setProperty("wdm.targetPath", "lib/drivers/auto/");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.quit();
    }

}