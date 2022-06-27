package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings {


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



}
