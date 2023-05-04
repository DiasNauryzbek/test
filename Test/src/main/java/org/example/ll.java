package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class ll {
    WebDriver driver;

    String customerID;
    Loginpage loginPage;
    HomePage homePage;
    NewCustomerPage newCustomerPage;
    NewAccount account;
    Deposit deposit;

    String accountID;
    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test()
    public void loginTest() throws InterruptedException{
        driver.get(" https://demo.guru99.com/v4");
        loginPage = new Loginpage(driver);
        loginPage.setUserName("mngr481325");
        loginPage.setPassword("rYbubUb");
        loginPage.clickLoginBtn();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/v4/manager/Managerhomepage.php");
    }


    @Test(priority = 1)
    public void createNewCustomer() throws InterruptedException{
        homePage = new HomePage(driver);
        homePage.clickNewCustomer();
        Thread.sleep(2000);
        newCustomerPage = new NewCustomerPage(driver);
        newCustomerPage.fillCustomeName("dddsas");
        newCustomerPage.fillCustomeGender("male");
        newCustomerPage.fillCustomeDate("26/03/2003");
        newCustomerPage.fillCustomeAddr("Dosppa");
        newCustomerPage.fillCustomeCity("Dassq");
        newCustomerPage.fillCustomeState("kdskdks");
        newCustomerPage.fillCustomePin("123456");
        newCustomerPage.fillCustomeTel("87074532123");
        Random random = new Random();
        newCustomerPage.fillCustomeEmail(random.nextInt(2000) +"q3231@ds.com");
        newCustomerPage.fillCustomePass("diasdiasdias");
        newCustomerPage.ClickCust();
        customerID = newCustomerPage.getCustomerId();
    }

    @Test(priority = 2)
    public void createNewAccount() throws InterruptedException{
        homePage = new HomePage(driver);
        homePage.clickNewAccount();
        Thread.sleep(2000);
        account = new NewAccount(driver);
        account.setCustomerID(customerID);
        account.selectAccountType("Current");
        account.setInitialDeposit("1000");
        account.clickSubmit();
        accountID = account.getAccountId();


    }

    @Test(priority = 3)
    public void deposit() throws InterruptedException{
        Thread.sleep(2000);
        homePage = new HomePage(driver);
        homePage.clickDeposit();
        Thread.sleep(2000);
        deposit = new Deposit(driver);
        deposit.setAccountNo(accountID);
        deposit.setAmount("500");
        deposit.setDescription("Deposit");
        deposit.clickSubmit();

    }

    @AfterSuite()
    public void close(){
        //driver.close();
    }
    @AfterTest
    public void quit() {
        driver.quit();
    }

}
