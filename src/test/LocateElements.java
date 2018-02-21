package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;

public class LocateElements extends Base {

    @Test
    public void locateElement() {
        driver.get("http://address-book-example.herokuapp.com/sign_in");

        //
        // Define Elements for comparison
        //

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        WebElement homeLink = driver.findElement(By.cssSelector("a"));
        WebElement signInButton = driver.findElement(By.cssSelector("input[data-test=submit]"));


        //
        // Standard Locator Strategies
        //

        WebElement id = driver.findElement(By.id("sign-in"));
        assertEquals(signInLink, id);

        WebElement name = driver.findElement(By.name("commit"));
        assertEquals(signInButton, name);

        WebElement homeClassName = driver.findElement(By.className("nav-item"));
        assertEquals(homeLink, homeClassName);

        WebElement homeTag = driver.findElement(By.tagName("a"));
        assertEquals(homeLink, homeTag);

        WebElement css = driver.findElement(By.cssSelector("a[data-test=sign-in]"));
        assertEquals(signInLink, css);

        WebElement xpath = driver.findElement(By.xpath("//a[@data-test='sign-in']"));
        assertEquals(signInLink, xpath);

        WebElement linkText = driver.findElement(By.linkText("Sign in"));
        assertEquals(signInLink, linkText);

        WebElement partialLinkText = driver.findElement(By.partialLinkText("Sign"));
        assertEquals(signInLink, partialLinkText);


        //
        // Use findElements
        //

        WebElement tag = driver.findElements(By.tagName("a")).get(1);
        assertEquals(signInLink, tag);

        WebElement className = driver.findElements(By.className("nav-item")).get(1);
        assertEquals(signInLink, className);


        //
        // CSS Locator Strategies
        //

        // id
        WebElement cssId = driver.findElement(By.cssSelector("#sign-in"));
        assertEquals(signInLink, cssId);

        // class
        WebElement cssClass = driver.findElements(By.cssSelector(".nav-item")).get(1);
        assertEquals(signInLink, cssClass);

        WebElement homeLinkCssClass = driver.findElement(By.cssSelector(".nav-item"));
        assertEquals(homeLink, homeLinkCssClass);

        // multiple classes
        WebElement cssMultClass = driver.findElements(By.cssSelector(".nav-item.nav-link")).get(1);
        assertEquals(signInLink, cssMultClass);

        WebElement homeLinkCssMultClass = driver.findElement(By.cssSelector(".nav-item"));
        assertEquals(homeLink, homeLinkCssMultClass);

        // attribute
        WebElement cssAttr = driver.findElement(By.cssSelector("a[data-test=sign-in]"));
        assertEquals(signInLink, cssAttr);

        // multiple attributes
        WebElement cssMultAttr = driver.findElement(By.cssSelector("a[data-test=sign-in][class='nav-item nav-link']"));
        assertEquals(signInLink, cssMultAttr);

        // attribute starts with
        WebElement cssAttrStart = driver.findElement(By.cssSelector("a[data-test^=sign]"));
        assertEquals(signInLink, cssAttrStart);

        // attribute ends with
        WebElement cssAttrEnd = driver.findElement(By.cssSelector("a[data-test$=in]"));
        assertEquals(signInLink, cssAttrEnd);

        // attribute contains
        WebElement cssAttrContain = driver.findElement(By.cssSelector("a[data-test*=gn-in]"));
        assertEquals(signInLink, cssAttrContain);

        // descendant
        WebElement cssDesc = driver.findElements(By.cssSelector(".navbar .nav-item")).get(1);
        assertEquals(signInLink, cssDesc);

        WebElement homeLinkCssDesc = driver.findElement(By.cssSelector(".navbar .nav-item"));
        assertEquals(homeLink, homeLinkCssDesc);

        // immediate following sibling
        WebElement cssFollow =  driver.findElement(By.cssSelector("a + .nav-item"));
        assertEquals(signInLink, cssFollow);

        // immediate previous sibling
        WebElement cssPrev = driver.findElement(By.cssSelector(".nav-item ~ a"));
        assertEquals(signInLink, cssPrev);

        // first child
        WebElement cssFirstChild = driver.findElement(By.cssSelector(".nav-item:first-child"));
        assertEquals(homeLink, cssFirstChild);

        // last child
        WebElement cssLastChild = driver.findElement(By.cssSelector(".nav-item:last-child"));
        assertEquals(signInLink, cssLastChild);

        // second child
        WebElement cssSecondChild = driver.findElement(By.cssSelector(".nav-item:nth-child(2)"));
        assertEquals(signInLink, cssSecondChild);

        // second child from the end
        WebElement cssSecondChildEnd = driver.findElement(By.cssSelector(".nav-item:nth-last-child(1)"));
        assertEquals(signInLink, cssSecondChildEnd);
    }

}

