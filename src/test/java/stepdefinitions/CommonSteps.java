package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;

import org.openqa.selenium.By;

import static stepdefinitions.Hooks.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CommonSteps {
    LoginPage loginPage = new LoginPage(driver);    

    @Given("I open the Juice Shop application")
    public void openJuiceShop() {
        driver.get("https://juice-shop.herokuapp.com");

        try {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button[aria-label='Close Welcome Banner']")).click();
        } catch (Exception e) {
            System.out.println("No welcome modal or already dismissed.");
        }
    }

    @When("I navigate to the login page")
    public void goToLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("I login with valid credentials")
    public void login() {
        driver.findElement(By.id("navbarAccount")).click();
        driver.findElement(By.id("navbarLoginButton")).click();
        driver.findElement(By.id("email")).sendKeys("demo@juice.com");
        driver.findElement(By.id("password")).sendKeys("demo123");
        driver.findElement(By.id("loginButton")).click();

        try {
    Robot robot = new Robot();
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
} catch (AWTException e) {
    e.printStackTrace();
} catch (InterruptedException e) {
    e.printStackTrace();
}

    }
}
