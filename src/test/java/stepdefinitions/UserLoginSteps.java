package stepdefinitions;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import static stepdefinitions.Hooks.driver;

public class UserLoginSteps {
    //WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @Then("I should be redirected to the home page")
    public void validateLogin() {
        homePage = new HomePage(driver);
        assert homePage.isLoggedIn();
    }

    @Then("Login error message appears")
    public void loginError() {
        homePage = new HomePage(driver);
        assert homePage.notLoggedIn();
    }
}
