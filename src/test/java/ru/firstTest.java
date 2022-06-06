package ru;
import org.junit.AfterClass;

import org.junit.Assert;

import org.junit.BeforeClass;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;




import java.util.concurrent.TimeUnit;




public class firstTest {

    public static WebDriver driver;

    public static LoginTest loginTest;

    public static ProfilePage profilePage;

    public static OrderPage orderPage;

    public static RemoveBasket removeBasket;

    public static Order2Element order2Element;
    @BeforeClass

    public static void setup() {

        driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "\"C:\\chromedriver.exe\"");

        loginTest = new LoginTest(driver);

        profilePage = new ProfilePage(driver);

        orderPage = new OrderPage(driver);

        removeBasket = new RemoveBasket(driver);

        order2Element = new Order2Element(driver);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);

        driver.get("https://gstore.ua/?gclid=Cj0KCQiAnuGNBhCPARIsACbnLzpIm0BunNyor6hcWxx9U2nLgtBOfdnQK-V0vDatFLojDQgOK4Pne48aAncaEALw_wcB");

    }

    @Test

    public void testLogin() throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        loginTest.clickLogin();

        loginTest.inputLogin();

        loginTest.inputPassword();

        loginTest.clickBtnLogin();

        profilePage.inputSearch1();

        profilePage.inputSearch();

        profilePage.clickSearch();

        orderPage.clickOrder();

        orderPage.getProductName();

        String name = orderPage.getProductName();

        Assert.assertEquals("Apple iPhone 4s 8Gb Black (MF267/LLA)", name);

        orderPage.getNumber();

        String value = orderPage.getNumber();

        Assert.assertEquals("1", value);

        removeBasket.removeProduct();

        String text=removeBasket.checkBascet();

        Assert.assertEquals("Мій кошик",text);

        order2Element.changePrice();

        order2Element.getPriceEqual();

        String priceEqual = order2Element.getPriceEqual();

        order2Element.clickOrder2();

        order2Element.getProductName2();

        String name2 = order2Element.getProductName2();

        Assert.assertEquals("Apple iPhone 4s 8Gb White (MF268/LLA)",name2);

        order2Element.getPriceEqual2();

        String price2 = order2Element.getPriceEqual2();

        Assert.assertEquals(priceEqual,price2);

    }



}