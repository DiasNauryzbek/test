package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    WebDriver driver;

    @FindBy(name = "uid")
    WebElement userIdFld;

    @FindBy(name = "password")
    WebElement passwordFld;

    @FindBy(name = "btnLogin")
    WebElement loginBtn;

    public Loginpage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String userName) {
        this.userIdFld.sendKeys(userName);
    }

    public void setPassword(String password) {
        this.passwordFld.sendKeys(password);
    }


    public void clickLoginBtn(){
        loginBtn.click();
    }
}