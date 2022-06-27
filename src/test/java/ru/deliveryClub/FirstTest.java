package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public ChromeDriver webdriver;
    @Before
    public void setUp(){
    //    System.setProperty("webdriver.chrome.driver","C:\\IT\\webriver\\chromedriver.exe");
        webdriver = new ChromeDriver();
        System.out.println("test start");
    }
    @Test
    public void firstTest() {
        webdriver.get("https://www.delivery-club.ru");
        String title = webdriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
            }

    @Test
    public void secondTest() {
        webdriver.get("https://www.delivery-club.ru");
        String title = webdriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
    }


    @After
    public void close(){
        System.out.println("test close");
        webdriver.quit();
    }
}
