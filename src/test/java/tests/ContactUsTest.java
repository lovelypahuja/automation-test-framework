package tests;

import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends BaseTest {

    @Test
    public void contactUsFormTest() {
        HomePage home = new HomePage(driver);
        home.goToContactUsPage();

        ContactUsPage contact = new ContactUsPage(driver);
        contact.fillContactForm("Alice", "alice@example.com", "Need help", "Having trouble logging in.");
        contact.submitForm();

        // TODO: Assert success message
    }
}
