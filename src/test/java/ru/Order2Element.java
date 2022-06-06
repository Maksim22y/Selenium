package ru;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;




import java.time.Duration;

public class Order2Element {
    public WebDriver driver;


    public Order2Element(WebDriver driver) {

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }
    public void changePrice(){
        WebElement inputPriceMin=driver.findElement(By.xpath("//input[@data-name=\"filter[price][min]\"]"));
        WebElement inputPriceMax=driver.findElement(By.xpath("//input[@data-name=\"filter[price][max]\"]"));
        WebElement buttonOkPrice= driver.findElement(By.xpath("//button[@class=\"btn __small\"]"));
        Actions actions=new Actions(driver);

        actions.doubleClick(inputPriceMin).click().build().perform();

        inputPriceMin.sendKeys("5558");

        actions.doubleClick(inputPriceMax).build().perform();

        inputPriceMax.sendKeys("17000");

        buttonOkPrice.click();

    }
    public String getPriceEqual() {
        String priceElementEqual = driver.findElement(By.cssSelector("div[data-id=\"320\"] .catalogCard-price")).getText();
        return priceElementEqual;
    }
    public void clickOrder2(){
        WebElement orderClick2= driver.findElement(By.xpath("//*[@id=\"j-buy-button-widget-320\"]/span"));

        orderClick2.click();
    }

    public  String getProductName2(){
        String nameElement=driver.findElement(By.cssSelector(".j-cart-product .cart-set-i:nth-child(1) .cart-title")).getText();
        return nameElement;
    }

    public String getPriceEqual2(){
        String priceElement=driver.findElement(By.xpath("//div[@class=\"cart-footer-b cart-cost j-total-sum\"]")).getText();
        return priceElement;

    }

}
