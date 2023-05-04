package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath="//a[text()='New Customer']")
    WebElement lnkNewCustomer;

    @FindBy(xpath="//a[text()='New Account']")
    WebElement lnkNewAccount;

    @FindBy(xpath="//a[text()='Deposit']")
    WebElement lnkDeposit;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNewCustomer() {
        lnkNewCustomer.click();
    }

    public void clickNewAccount() {
        lnkNewAccount.click();
    }

    public void clickDeposit() {
        lnkDeposit.click();
    }
}
