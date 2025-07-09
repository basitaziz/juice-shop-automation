package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    WebDriver driver;

    By Register = By.xpath("//*[text()='Register Now']");
    By Quantity = By.xpath("//tr[@data-id=\"342561\"]//td[@class=\"ticket-quantity\"]//select");
    By fname = By.xpath("//label[text()='First Name *']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() throws InterruptedException {
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is *visible*, not just present
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            Register
        ));
        driver.findElement(Register).click();
    }

    public void isCartUpdated() {

        // 1. Get all window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // 2. Convert to a list to switch by index
        List<String> tabs = new ArrayList<>(windowHandles);

        // 3. Switch to the new tab (usually the second one)
        driver.switchTo().window(tabs.get(1));

        // 4. Do something in the new tab
        System.out.println("New tab title: " + driver.getTitle());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is *visible*, not just present
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            Quantity
        ));

        WebElement dropdown = driver.findElement(Quantity);

        // Create Select object
        Select select = new Select(dropdown);

        // Select by visible text
        select.selectByVisibleText("1");
        wait.until(ExpectedConditions.elementToBeClickable(
            Register
        ));
        driver.findElement(Register).click();

        wait.until(ExpectedConditions.elementToBeClickable(
            fname
        ));

        WebElement packagElement = driver.findElement(fname);
        Assert.assertTrue("Header not displayed", packagElement.isDisplayed());

    }
}
