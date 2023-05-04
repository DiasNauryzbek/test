package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.xml.xpath.XPath;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Xpathh {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        WebElement log = driver.findElement(By.id("login-button"));
        log.click();
        boolean prod = driver.findElement(By.id("header_container"))
                .isDisplayed();
        System.out.println("Product page is " + prod);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        boolean sau = driver.findElement(By.className("inventory_item_name"))
                .isDisplayed();
        System.out.println("Product display is " + sau);
        driver.findElement(By.id("checkout")).click();
        WebElement firstname = driver.findElement(By.id("first-name"));
        WebElement lastname = driver.findElement(By.id("last-name"));
        WebElement post = driver.findElement(By.id("postal-code"));
        firstname.sendKeys("Dias");
        lastname.sendKeys("Nauryzbek");
        post.sendKeys("20201");
        driver.findElement(By.id("continue")).click();
        boolean summary = driver.findElement(By.className("summary_info"))
                .isDisplayed();
        System.out.println("Order summary is " + summary);
        driver.findElement(By.id("finish")).click();
        boolean finish = driver.findElement(By.id("checkout_complete_header"))
                .isDisplayed();
        System.out.println("Thank you page is " + finish);







    }
}