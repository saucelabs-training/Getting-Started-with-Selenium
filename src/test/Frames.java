package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Frames extends Base {

    @Test
    public void frameSwitching() {
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(1);
        assertEquals("BOTTOM", driver.findElement(By.tagName("body")).getText());

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        assertEquals("LEFT", driver.findElement(By.tagName("body")).getText());

        driver.switchTo().defaultContent();
        assertTrue(driver.findElements(By.name("frame-top")).size() > 0);
    }

}

