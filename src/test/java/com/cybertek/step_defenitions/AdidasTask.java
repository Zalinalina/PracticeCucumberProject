package com.cybertek.step_defenitions;

import com.cybertek.pages.DemoPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class AdidasTask {

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoUrl"));
    }

    @When("user click on laptops category")
    public void user_click_on_laptops_category() {
        DemoPage demo = new DemoPage();
        BrowserUtils.sleep(1);
        demo.laptops.click();

    }

    @When("user click on Laptop Sony vaio i5")
    public void user_click_on_laptop_sony_vaio_i5() {

    }

    @When("user click on Add to cart")
    public void user_click_on_add_to_cart() {

    }

    @Then("user should be able to accept pop up confirmation and add iter in cart")
    public void user_should_be_able_to_accept_pop_up_confirmation_and_add_iter_in_cart() {

    }

    @When("user click on  Laptop Dell i7 8gb")
    public void user_click_on_laptop_dell_i7_8gb() {

    }

    @When("user click cart button")
    public void userClickCartButton() {
    }

    @Then("user should be able to navigate cart page")
    public void userShouldBeAbleToNavigateCartPage() {
    }

    @And("user should be able to delete any item from the cart by clicking button delete")
    public void userShouldBeAbleToDeleteAnyItemFromTheCartByClickingButtonDelete() {
    }

    @Given("user on the cart page")
    public void userOnTheCartPage() {
    }

    @When("user click on button {string}")
    public void userClickOnButton(String arg0) {
    }

    @And("user fill in all web form fields")
    public void userFillInAllWebFormFields() {
        WebElement driver;
//        findElement(By.xpath("//button[.='Place Order']")).click();
//        Faker faker = new Faker();
//        driver.findElement(By.id("name")).sendKeys(faker.name().fullName());
//        driver.findElement(By.id("country")).sendKeys(faker.country().name());
//        driver.findElement(By.id("city")).sendKeys(faker.country().capital());
//        driver.findElement(By.id("card")).sendKeys(faker.finance().creditCard());
//        driver.findElement(By.id("month")).sendKeys(String.valueOf(faker.number().numberBetween(1,12)));
//        driver.findElement(By.id("year")).sendKeys(String.valueOf(faker.number().numberBetween(2022,2030)));
//        driver.findElement(By.xpath("//button[.='Purchase']")).click();
//        BrowserUtils.sleep(1);
    }

    @When("user click on button Place order")
    public void userClickOnButtonPlaceOrder() {
    }

    @And("user click on purchase button")
    public void userClickOnPurchaseButton() {
    }

    @Then("user should be able to make purchase")
    public void userShouldBeAbleToMakePurchase() {
    }
}
