package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver webdriver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\IT\\webriver\\chromedriver.exe");
        webdriver = new ChromeDriver();
    }

    @After
    public void close(){
        webdriver.quit();
    }
}
