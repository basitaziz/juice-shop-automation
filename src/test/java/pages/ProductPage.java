package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(By.xpath("//span[text()='Add to Basket']")).click();
    }

    public boolean isCartUpdated() {
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is *visible*, not just present
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//div[contains(text(), 'Added')]")
        ));
        return true;
    } catch (Exception e) {
        return false;
    }
    }
}
