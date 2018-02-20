package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class SeleniumExamples extends Base {

    @Test
    public void takeAction() {
        driver.get("http://address-book-example.herokuapp.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement signIn =  wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("sign-in")));

        signIn.click();

        assertEquals("Address Book - Sign In", driver.getTitle());
    }

}

