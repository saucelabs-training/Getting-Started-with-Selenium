package test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class Base {

    protected WebDriver browser;

    @Before
    public void setup() {
        System.setProperty("wdm.targetPath", "lib/drivers/");
        ChromeDriverManager.getInstance().setup();
    }

}
