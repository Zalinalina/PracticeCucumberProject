package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemoPage {
    @FindBy(xpath = "//a[.='Phones']")
    public WebElement phones;
    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptops;
    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitors;

    @FindBy(xpath = "//div[@id='tbodyid']//div//div//div")
    public List<WebElement> listOfItems;

    public final int listOfPhones = 7;
    public final int listOfLaptops = 6;
    public final int listOfMonitors = 2;

    @FindBy(xpath = "//li[@class='nav-item active']//a")
    public WebElement homeButton;

    @FindBy(xpath = "//*[.='Dell i7 8gb']/..//a")
    public WebElement deleteDellButton;

    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement countryInputBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInputBox;

    @FindBy(xpath = "//input[@id='card']")
    public WebElement creditCardInputBox;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement monthInputBox;

    @FindBy(xpath = "//input[@id='year']")
    public WebElement yearInputBox;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement finalMessage;

    @FindBy(xpath = "//h4//a[contains(text(),'Sony vaio i7')]")
    public WebElement sonyVaioI5;

    @FindBy(xpath = "//h4//a[contains(text(),'Dell i7 8gb')]")
    public WebElement dellI78gb;

    @FindBy(css = "h2.name")
    public WebElement assertProductPage;

    @FindBy(xpath = "//*[.='Add to cart']//a")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[.='Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> itemsInCart;

    @FindBy(css = "#orderModalLabel")
    public WebElement assertPlaceOrder;

    @FindBy(xpath = "//h2[contains(text(),'Thank you')]")
    public WebElement assertSuccess;

    public String total = "790";

    @FindBy(xpath = "//*[.='OK']")
    public WebElement okButton;

    @FindBy(xpath = "//*[.='CATEGORIES']")
    public WebElement categories;



}


