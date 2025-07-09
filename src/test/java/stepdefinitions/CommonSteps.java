package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import static stepdefinitions.Hooks.driver;


public class CommonSteps {
    LoginPage loginPage = new LoginPage(driver);
    WebDriver wait;


    @Given("I open the Juice Shop application")
    public void openJuiceShop() {
        driver.get("https://owasp.org/www-project-juice-shop/");
        
    }

    @When("I navigate to the login page")
    public void goToLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @And("I login with valid credentials")
    public void login() {
        
        loginPage.login("basitaziz090@gmail.com","A12345@67b");

    }

    @And("I login with Invalid credentials")
    public void invalidLogin() {
        
        loginPage.login("basitaziz090@gmail.com","A12345@6");

    }
}
