package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    //WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By Join = By.xpath("(//a[@class='cta-button'])[1]");
    By loginButton = By.xpath("//a[@class='signin']");
    By register = By.xpath("//a[text()='Register Now']");
    By email = By.xpath("//input[@name='email']");
    By password = By.xpath("//input[@name='password']");
    By login = By.xpath("//button[@data-id='submit']");
    By skip = By.xpath("//button[@data-id='reset']");

    public void goToLoginPage() {
        driver.findElement(Join).click();
        driver.findElement(loginButton).click();
    }

    public void goToRegistration() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
        wait.until(ExpectedConditions.elementToBeClickable(register));
        //driver.findElement(register).click();
        WebElement element = driver.findElement(register);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void login(String mail,String passcode) {

        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(passcode);
        driver.findElement(login).click();
        // try{
        //     wait.until(ExpectedConditions.elementToBeClickable(skip));
        //     driver.findElement(skip).click();

        // }catch(Exception e){

        // }


    }
}
