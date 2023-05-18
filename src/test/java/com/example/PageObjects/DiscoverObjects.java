package com.example.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DiscoverObjects {
    WebDriver driver;
    String word;

    public DiscoverObjects(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By splash_next = By.xpath("//*[@id='root']/div[1]/div[2]/div");
    By explore_communities = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[1]/a/button");

    // Methods:

    // ------------------------------ Important
    // ---------------------------------------
    public void dimensionss() {
        Dimension dimension = new Dimension(390, 844);
        driver.manage().window().setSize(dimension);
    }

    public void waiiit(By wwt) throws InterruptedException {
        try {
            if (driver.findElement(wwt).isDisplayed()) {
                return;
            }
        } catch (Exception e) {
            Thread.sleep(2000);
            return;
        }
    }

    // ------------------------------ Genral ---------------------------------------

    public void Splash_nextt() throws InterruptedException {
        waiiit(splash_next);
        driver.findElement(splash_next).click();
    }

    public void verify_page() throws InterruptedException {
        waiiit(explore_communities);
        word = driver.findElement(explore_communities).getText();
        System.out.println(word);
        Assert.assertEquals(word, "Explore Communities");
    }

    // public void splash_next() throws InterruptedException {
    // try {
    // System.out.println("enters");

    // if (driver.findElement(splash_next).isDisplayed()) {
    // System.out.println(driver.findElement(splash_next).isDisplayed());
    // driver.findElement(splash_next).click();
    // return;
    // // break;
    // }
    // // }
    // } catch (Exception e) {
    // // TODO: handle exception
    // Thread.sleep(4000);
    // splash_next();
    // return;
    // }
    // }

}
