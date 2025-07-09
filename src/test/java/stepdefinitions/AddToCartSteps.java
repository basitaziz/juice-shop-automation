package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import pages.ProductPage;
import static stepdefinitions.Hooks.driver; 

public class AddToCartSteps {
    //WebDriver driver;
    ProductPage productPage;

    @When("I add a product to the cart")
    public void addToCart() {
        productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
    }

    @Then("the cart should show the product")
    public void validateCart() {
        productPage.isCartUpdated();
    }
}
