package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class SubscriptionTest extends BaseTest {

    @Test
    public void newsletterSubscriptionTest() {
        HomePage home = new HomePage(driver);
        home.subscribeToNewsletter("newsletter@example.com");

        // TODO: Assert subscription success message is shown
    }
}
