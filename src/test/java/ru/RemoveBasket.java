package ru;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RemoveBasket {
    public WebDriver driver;




    public  RemoveBasket(WebDriver driver) {

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }
    public void removeProduct(){
       WebElement basket= driver.findElement(By.xpath("//a[@class=\"cart-remove-btn j-remove-p\"]"));
        basket.click();

        Alert confirm=driver.switchTo().alert();
        confirm.accept();

         WebElement krestik=driver.findElement(By.xpath("//a[@onclick=\"Modal.close(); return false;\"]"));
        krestik.click();
    }

    public String checkBascet (){
      String bascetNum=driver.findElement(By.cssSelector("div[class=\"basket is-empty\"] .basket__value")).getText();
    return bascetNum;
    }
}
