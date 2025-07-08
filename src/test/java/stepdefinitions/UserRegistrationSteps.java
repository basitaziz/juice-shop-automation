package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static stepdefinitions.Hooks.driver;

import java.util.Random;

public class UserRegistrationSteps {
    //WebDriver driver;
    LoginPage loginPage;

    

    @When("I navigate to the registration page")
    public void goToRegistrationPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.goToRegistration();
    }

    @And("I register a user with random credentials")
    public void registerRandomUser() {
        Random random = new Random();
        int randomNum = random.nextInt(10000); // Generates 0–9999
        String email = "string" + randomNum + "@test.com";
        driver.findElement(By.xpath("//input[@aria-label='Email address field']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@aria-label='Field for the password']")).sendKeys("demo123");
        driver.findElement(By.xpath("//input[@aria-label='Field to confirm the password']")).sendKeys("demo123");
        driver.findElement(By.id("mat-mdc-form-field-label-8")).click();
        driver.findElement(By.id("mat-select-1-panel")).click();
        driver.findElement(By.id("securityAnswerControl")).sendKeys("abcd");
        driver.findElement(By.xpath("//*[text()=' Register ']")).click();
    }

    @Then("I should see the registration confirmation")
    public void registrationSuccess() {
        // Validate confirmation - omitted
        driver.quit();
    }
}
