package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {
    WebDriver driver;

    By home = By.xpath("//h1[text()='Home']");
    By error = By.xpath("//h1[text()='Invalid Credentials']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoggedIn() {
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is *visible*, not just present
        wait.until(ExpectedConditions.visibilityOfElementLocated(home));
        return true;
    } catch (Exception e) {
        return false;
    }
    }

    public boolean notLoggedIn() {
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is *visible*, not just present
        wait.until(ExpectedConditions.visibilityOfElementLocated(error));
        return true;
    } catch (Exception e) {
        return false;
    }
    }
}
