package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.delivery-club.ru");
        String title = webDriver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
        webDriver.quit();
    }
}
