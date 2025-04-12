package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage();

        LoginPage login = new LoginPage(driver);
        login.login("testuser@example.com", "password123");

        // TODO: Assert user is logged in (e.g., check logout link visibility)
    }
}
