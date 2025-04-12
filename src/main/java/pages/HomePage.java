package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By signupLogin = By.xpath("//a[contains(text(),'Signup / Login')]");
    private By contactUs = By.xpath("//a[contains(text(),'Contact us')]");
    private By products = By.xpath("//a[contains(text(),'Products')]");
    private By subscribeInput = By.id("susbscribe_email");
    private By subscribeButton = By.id("subscribe");

    public void goToLoginPage() {
        click(signupLogin);
    }

    public void goToContactUsPage() {
        click(contactUs);
    }

    public void goToProductsPage() {
        click(products);
    }

    public void subscribeToNewsletter(String email) {
        type(subscribeInput, email);
        click(subscribeButton);
    }
}
