package com.example.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostDetail {
    WebDriver driver;
    String word;

    public PostDetail(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By Bookmark = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[1]/img");
    By Like = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[2]/li[1]/span/span[1]/img");
    By Dislike = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[2]/li[1]/span/span[2]/img");
    By G_user_icon = By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/img");
    By back_arrow = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");

    // -------- Important ------------
    public void waiiit(By wwt) throws InterruptedException {
        try {
            if (driver.findElement(wwt).isDisplayed()) {
                return;
            }
        } catch (Exception e) {
            Thread.sleep(9000);
            return;
        }
    }

    // -------- Guest User ------------
    public void click_bookmark() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(Bookmark);
        driver.findElement(Bookmark).click();
    }

    public void click_Like() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(Like);
        driver.findElement(Like).click();
    }

    public void click_Dislike() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(Dislike);
        driver.findElement(Dislike).click();
    }

    public void click_g_user_icon() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(G_user_icon);
        driver.findElement(G_user_icon).click();
    }

    public void click_back_arrow() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(back_arrow);
        driver.findElement(back_arrow).click();
    }
}
