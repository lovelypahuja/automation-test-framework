package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By email = By.name("email");
    private By password = By.name("password");
    private By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    public void login(String userEmail, String userPassword) {
        type(email, userEmail);
        type(password, userPassword);
        click(loginBtn);
    }
}
