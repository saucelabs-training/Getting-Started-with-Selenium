package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class ElementActions extends Base {

    @Test
    public void elementActions() {
        driver.get("http://address-book-example.herokuapp.com");

        driver.findElement(By.id("sign-in")).click();

        driver.findElement(By.id("session_email")).clear();

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("sauce@example.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("password");

        driver.findElement(By.tagName("form")).submit();

        assertEquals("Address Book", driver.getTitle());
    }

}

