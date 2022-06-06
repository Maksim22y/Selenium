package ru;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;




import java.time.Duration;






public class ProfilePage {

    public WebDriver driver;

    public ProfilePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

        this.driver = driver;

    }


    public void inputSearch1() {
        WebElement img= driver.findElement(By.xpath("//span[@class=\"userbar__button-text\"]"));

        img.isDisplayed();
    }
        public void inputSearch () {
                WebElement nameProduct = driver.findElement(By.xpath("//input[@class='search__input']"));

                nameProduct.sendKeys("iphone");

        }

        public void clickSearch () {

            WebElement searchBtn = (new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='search__button']"))));

            searchBtn.click();

        }

    }
