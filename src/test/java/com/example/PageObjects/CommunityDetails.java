package com.example.PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommunityDetails {
    WebDriver driver;
    String word;
    boolean t;

    public CommunityDetails(WebDriver driver) {
        this.driver = driver;
    }

    // --------- Xpaths ---------
    By back_arrow_btn = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");
    By join_community_btn = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[1]/div[1]/div[2]/div[1]/button");

    // --------- Genral ---------
    // wait untill the element is found
    public void waiiit(By yy) throws InterruptedException {
        Thread.sleep(6000);
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement aboutMe;
        aboutMe = webdwait.until(ExpectedConditions.elementToBeClickable(yy));
    }

    // scroll into view
    public void scroll(By scrol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scrol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // --------- Methods ---------
    // click back arrow button
    public void click_back_arrow_btn() throws InterruptedException {
        waiiit(back_arrow_btn);
        driver.findElement(back_arrow_btn).click();
    }

    // verify community detail screen is opened
    public void verify_open_communnity_detail_screen() throws InterruptedException {
        waiiit(join_community_btn);
        t = driver.findElement(join_community_btn).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(true, t);
    }
}
