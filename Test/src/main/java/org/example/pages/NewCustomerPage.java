package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
    WebDriver driver;

    @FindBy(name = "name")
    WebElement customerName;

    @FindBy(name = "rad1")
    WebElement customerGender;

    @FindBy(name = "dob")
    WebElement customerDate;

    @FindBy(name = "addr")
    WebElement customerAddress;

    @FindBy(name = "city")
    WebElement customerCity;

    @FindBy(name = "state")
    WebElement customerState;
    @FindBy(name = "pinno")
    WebElement customerPin;
    @FindBy(name = "telephoneno")
    WebElement customerTel;

    @FindBy(name = "emailid")
    WebElement customerEmail;

    @FindBy(name = "password")
    WebElement customerPass;

    @FindBy(name = "sub")
    WebElement customerBtn;





    public NewCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void fillCustomeName(String customerName){
        this.customerName.sendKeys(customerName);
    }
    public void fillCustomeGender(String customerGender){
        this.customerGender.sendKeys(customerGender);
    }
    public void fillCustomeDate(String customerDate){
        this.customerDate.sendKeys(customerDate);
    }
    public void fillCustomeAddr(String customerAddress){
        this.customerAddress.sendKeys(customerAddress);
    }
    public void fillCustomeCity(String customerCity){
        this.customerCity.sendKeys(customerCity);
    }
    public void fillCustomeState(String customerState){
        this.customerState.sendKeys(customerState);
    }
    public void fillCustomePin(String customerPin){
        this.customerPin.sendKeys(customerPin);
    }
    public void fillCustomeTel(String customerTel){
        this.customerTel.sendKeys(customerTel);
    }
    public void fillCustomeEmail(String customerEmail){
        this.customerEmail.sendKeys(customerEmail);
    }
    public void fillCustomePass(String customerPass){
        this.customerPass.sendKeys(customerPass);
    }
    public void ClickCust(){
        customerBtn.click();
    }

    public String getCustomerId(){
        WebElement e = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]"));
        String customerId = e.getText();
        return customerId;
    }
}
