package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    Logger log = LogManager.getLogger(LoginTest.class);

    @Test
    public void validLoginTest() {
        log.info("Starting login test...");
        HomePage home = new HomePage(driver);
        home.goToLoginPage();

        LoginPage login = new LoginPage(driver);
        login.login("lovelypahuja@gmail.com", "India@123");

        // TODO: Assert user is logged in (e.g., check logout link visibility)
        Assert.assertTrue(driver.getPageSource().contains("Logged in as"), "User login failed");

        log.info("Login test finished.");

    }
}
