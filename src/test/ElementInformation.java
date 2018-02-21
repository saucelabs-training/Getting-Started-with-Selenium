package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ElementInformation extends Base {

    @Test
    public void elementActions() {
        driver.get("http://address-book-example.herokuapp.com");

        WebElement signIn = driver.findElement(By.id("sign-in"));

        assertEquals("Sign in", signIn.getText());
        assertEquals("sign-in", signIn.getAttribute("data-test"));
        assertTrue(signIn.isDisplayed());
        assertTrue(signIn.isEnabled());
    }

}

