package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementActionsAdvanced extends Base {

    @Test
    public void actionsClass() {
        driver.get("http://address-book-example.herokuapp.com");

        Actions action = new Actions(driver);

        // click
        action.click(driver.findElement(By.id("sign-in"))).build().perform();

        WebElement element = driver.findElement(By.id("sign-in"));
        WebElement element2 = driver.findElement(By.tagName("a"));

        // hover
        action.moveToElement(element).build().perform();

        // drag and drop
        action.dragAndDrop(element, element2).build().perform();

        // click-pause-release
        action.clickAndHold(element).pause(100).release().build().perform();

        // right-click
        action.contextClick(element).build().perform();

        // double-click
        action.doubleClick(element).build().perform();

        // control-click
        action.keyDown(Keys.CONTROL).click(element).build().perform();

    }

}

