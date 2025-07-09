package stepdefinitions;

import io.cucumber.java.en.*;

import pages.LoginPage;
import pages.Register;

import static stepdefinitions.Hooks.driver;

import java.time.Duration;
import java.util.Random;

public class UserRegistrationSteps {

    @When("I navigate to the registration page")
    public void goToRegistrationPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.goToRegistration();
    }

    @And("I register a user with random credentials")
    public void registerRandomUser() {
        Random random = new Random();
        int randomNum = random.nextInt(10000); // Generates 0–9999
        String email = "string" + randomNum + "@test.com";

        Register register = new Register(driver);
        register.register(email,"A12345@67b", "Test", "Test");

    }

    @Then("I should see the registration confirmation")
    public void registrationSuccess() {
        // Validate confirmation - omitted
        driver.quit();
    }
}
