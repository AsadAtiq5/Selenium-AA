package com.example.PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostDetails {
    WebDriver driver;
    String word;
    boolean t;

    public PostDetails(WebDriver driver) {
        this.driver = driver;
    }

    // --------- Xpaths ---------
    By visit_website_btn = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/a/button");

    // --------- Genral ---------
    // wait untill the element is found
    public void waiiit(By yy) {
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement aboutMe;
        aboutMe = webdwait.until(ExpectedConditions.visibilityOfElementLocated(yy));
    }

    // scroll into view
    public void scroll(By scrol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scrol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // --------- Methods ---------
    // verify visit website button on profile detail screen
    public void verify_visit_website_btn_on_post_detail() throws InterruptedException {
        waiiit(visit_website_btn);
        t = driver.findElement(visit_website_btn).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(true, t);
    }
}
