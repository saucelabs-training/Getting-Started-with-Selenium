package test;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class SeleniumExamples extends Base {

    @Test
    public void navigateBrowser() {
        driver.get("http://a.testaddressbook.com");

        assertEquals("Address Book", driver.getTitle());
    }

}