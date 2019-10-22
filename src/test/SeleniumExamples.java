package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static junit.framework.TestCase.assertEquals;

public class SeleniumExamples extends Base {

    @Test
    public void findElement() {
        driver.get("http://a.testaddressbook.com");

        WebElement id = driver.findElement(By.id("sign-in"));
        WebElement css = driver.findElement(By.cssSelector("#sign-in"));

        assertEquals(id, css);
    }

}