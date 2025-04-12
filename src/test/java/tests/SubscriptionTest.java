package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionTest extends BaseTest {

    @Test
    public void newsletterSubscriptionTest() {
        HomePage home = new HomePage(driver);
        home.subscribeToNewsletter("newsletter@example.com");

        // TODO: Assert subscription success message is shown
        Assert.assertTrue(driver.getPageSource().contains("You have been successfully subscribed"), "Subscription failed");

    }
}
