package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit {
    WebDriver driver;

    @FindBy(name="accountno")
    WebElement txtAccountNo;

    @FindBy(name="ammount")
    WebElement txtAmount;

    @FindBy(name="desc")
    WebElement txtDescription;

    @FindBy(name="AccSubmit")
    WebElement btnSubmit;

    public Deposit(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAccountNo(String strAccountNo) {
        txtAccountNo.sendKeys(strAccountNo);
    }

    public void setAmount(String strAmount) {
        txtAmount.sendKeys(strAmount);
    }

    public void setDescription(String strDescription) {
        txtDescription.sendKeys(strDescription);
    }

    public void clickSubmit() {
        btnSubmit.click();
    }
}
