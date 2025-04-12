package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
    private WebDriver driver;

    private By nameInput = By.name("name");
    private By emailInput = By.name("email");
    private By subjectInput = By.name("subject");
    private By messageInput = By.name("message");
    private By submitButton = By.name("submit");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactForm(String name, String email, String subject, String message) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(subjectInput).sendKeys(subject);
        driver.findElement(messageInput).sendKeys(message);
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }
}
