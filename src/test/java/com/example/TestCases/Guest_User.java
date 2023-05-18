package com.example.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.PageObjects.DiscoverObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guest_User {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.aa-stage.global-drum.com/");
    }

    public void quit() {
        driver.quit();
    }

    @Test(priority = 1)
    public void open_application() throws InterruptedException {
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.verify_page();
        quit();
    }

    @Test(priority = 2)
    public void Verify_Click_Guest_user_icon() {
    }

}
