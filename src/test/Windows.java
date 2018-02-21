package test;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Windows extends Base {

    @Test
    public void windowSwitching() {
        driver.get("https://google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://www.example.com');");

        String origWindow = driver.getWindowHandle();
        Set handles = driver.getWindowHandles();
        handles.remove(origWindow);

        String nextWindow = String.valueOf(handles.iterator().next());

        driver.switchTo().window(nextWindow);
        assertEquals("Example Domain", driver.getTitle());

        driver.close();
        driver.switchTo().window(origWindow);
        assertEquals("Google", driver.getTitle());
    }

}

