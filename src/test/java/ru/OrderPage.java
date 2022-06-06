package ru;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;




import java.time.Duration;




public class OrderPage {

    public WebDriver driver;




    public OrderPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }




    public void clickOrder() {

        WebElement orderBtn = driver.findElement(By.xpath("//a[@id=\"j-buy-button-widget-319\"]"));

        orderBtn.click();

    }

    public String getProductName(){

        String productName = driver.findElement(By.cssSelector("tbody[class=\"cart-section __promo j-remove-container\"] .cart-set-i:nth-child(1) .cart-title")).getText();

        return productName;

    }

    public String getNumber(){

        String productValue = driver.findElement(By.xpath("//input[@class=\"counter-field j-quantity-p\"]")).getAttribute("value");

        return productValue;

    }
    public  void closeDriver(){
        driver.close();
    }

}

