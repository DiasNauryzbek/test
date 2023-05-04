package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver;
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        WebElement username = driver.findElement(By.id("userName"));

        username.sendKeys("Dias");

        WebElement email = driver.findElement(By.id("userEmail"));

        email.sendKeys("nauryzbekdias@gmail.com");

        WebElement curadd = driver.findElement(By.id("currentAddress"));
        curadd.sendKeys("Almaty");



        WebElement peradd = driver.findElement(By.id("permanentAddress"));
        peradd.sendKeys("Almaty");



        WebElement signInBtn = driver.findElement(By.id("submit"));



        signInBtn.getText();



    }
}
