package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.By;
import static stepdefinitions.Hooks.driver;

public class UserLoginSteps {
    //WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;


    

    // @And("I login with valid credentials")
    // public void loginWithValidCredentials() {
    //     driver.findElement(By.id("email")).sendKeys("demo@juice.com");
    //     driver.findElement(By.id("password")).sendKeys("demo123");
    //     driver.findElement(By.id("loginButton")).click();
    // }

    @Then("I should be redirected to the home page")
    public void validateLogin() {
        homePage = new HomePage(driver);
        assert homePage.isLoggedIn();
        driver.quit();
    }
}
