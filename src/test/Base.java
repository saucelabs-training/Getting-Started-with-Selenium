package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;


public class Base {

    WebDriver driver;

    @Rule
    public TestWatcher watcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println(description.getMethodName() + ": Failed");
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println(description.getMethodName() + ": Succeeded");
        }
    };

    @Before
    public void setup() throws MalformedURLException {
        System.setProperty("wdm.targetPath", "lib/drivers/auto/");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }

}
