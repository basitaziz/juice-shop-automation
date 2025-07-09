package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
    WebDriver driver;
    //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    By mail = By.xpath("//input[@data-type='email']");
    By checkBox= By.xpath("//span[@class='label-content']");
    By submit = By.xpath("//button[@data-id='submit']");

    By fname = By.xpath("//input[@name='firstName']");
    By lname = By.xpath("//input[@name='lastName']");
    By pass = By.xpath("//input[@name='password']");

    public Register(WebDriver driver) {
        this.driver = driver;
    }

    public void register(String email, String password, String firstName, String lastName){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mail));
        driver.findElement(mail).sendKeys(email);
        WebElement element = driver.findElement(checkBox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        //driver.findElement(By.id("//span[@class='label-content']")).click();
        driver.findElement(submit).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(fname));
        driver.findElement(fname).sendKeys(firstName);
        driver.findElement(lname).sendKeys(lastName);
        driver.findElement(pass).sendKeys(password);
        WebElement checkbox = driver.findElement(checkBox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        driver.findElement(submit).click();

    }


}
