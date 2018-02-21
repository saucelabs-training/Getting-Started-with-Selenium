package test;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.util.function.Function;

import static java.util.concurrent.TimeUnit.MICROSECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Waits extends Base {

    @Test
    public void waitMethods() {
        driver.get("http://address-book-example.herokuapp.com/");

        WebDriverWait explicitWait = new WebDriverWait(driver, 10);

        WebElement explicitElement = explicitWait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.id("sign-in")));

        assertEquals("Sign in", explicitElement.getText());

        driver.navigate().refresh();
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(5, SECONDS)
                .pollingEvery(500, MICROSECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement fluentElement = (WebElement) fluentWait
                .until(new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver browser) {
                        return driver.findElement(By.id("sign-in"));
                    }
                });

        assertEquals("Sign in", fluentElement.getText());
    }

}

