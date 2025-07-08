package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountButton = By.id("navbarAccount");
    By loginButton = By.id("navbarLoginButton");
    By newCustomerLink = By.linkText("Not yet a customer?");

    public void goToLoginPage() {
        driver.findElement(accountButton).click();
        driver.findElement(loginButton).click();
    }

    public void goToRegistration() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.findElement(newCustomerLink).click();
    }
}
