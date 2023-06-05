package com.example.PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupModal {
    WebDriver driver;
    String word;

    public SignupModal(WebDriver driver) {
        this.driver = driver;
    }

    // --------- Xpaths ---------
    By text_signup_modal = By.xpath("//*[@id='root']/div[2]/div[4]/div/div/h1");
    By cross_btn = By.xpath("//*[@id='root']/div[2]/div[4]/button/img");

    // --------- Genral ---------
    // wait untill the element is found
    public void waittt(By yy) {
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
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
    // Verify signup modal text when click My Feed
    public void verify_signup_modal_text_my_feed() throws InterruptedException {
        waittt(text_signup_modal);
        word = driver.findElement(text_signup_modal).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Please sign up to access this feature", word);
    }

    // verify signup modal text when click profile icon
    public void verify_signup_modal_text_profile_icon() throws InterruptedException {
        waittt(text_signup_modal);
        word = driver.findElement(text_signup_modal).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals(
                "The profile feature is only available for registered users, register today to set up your profile",
                word);
    }

    // verify signup modal text when view 10 posts
    public void verify_signup_modal_text_tenth_post() throws InterruptedException {
        waittt(text_signup_modal);
        word = driver.findElement(text_signup_modal).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Please sign up to view more posts", word);
    }

    // click cross button
    public void click_cross_btn() throws InterruptedException {
        waittt(cross_btn);
        driver.findElement(cross_btn).click();
    }
}
