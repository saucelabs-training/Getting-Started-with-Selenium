package test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExamples {

    @Test
    public void openBrowser() {
        System.setProperty("wdm.targetPath", "lib/drivers/");
        ChromeDriverManager.getInstance().setup();

        WebDriver driver = new ChromeDriver();
        driver.quit();
    }

}