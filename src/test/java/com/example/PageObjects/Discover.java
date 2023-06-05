package com.example.PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Discover {
    WebDriver driver;
    String word;

    public Discover(WebDriver driver) {
        this.driver = driver;
    }

    // --------- Xpaths ---------
    By explore_community_btn = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/div[1]/div[1]/a/button");
    By nxt_btn_splash = By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/button");
    By my_feed_tab_btn = By.xpath("//*[@id='hoverEffect-0']/button");
    By text_signup_modal = By.xpath("//*[@id='root']/div[2]/div[4]/div/div/h1");
    By profile_icon = By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/img");
    By post_card = By.xpath("//*[@id='dashboardListing-0']/div");
    By bookmark_btn = By.xpath("//*[@id='dashboardListing-0']/div/div[2]/ul[2]/li/img");
    By tenth_post = By.xpath("//*[@id='dashboardListing-9']");
    By back_to_top_btn = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/div[1]/div[12]/button");

    // --------- Genral ---------
    // To convert into mobile view
    public void set_dimensionss() {
        Dimension dimension = new Dimension(290, 1044);
        driver.manage().window().setSize(dimension);
    }

    // wait untill the element is found
    public void waiiit(By yy) throws InterruptedException {
        Thread.sleep(6000);
        WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement aboutMe;
        aboutMe = webdwait.until(ExpectedConditions.visibilityOfElementLocated(yy));
    }

    // click splash screen next button
    public void click_splash_next_btn() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(nxt_btn_splash);
        driver.findElement(nxt_btn_splash).click();
    }

    // scroll into view
    public void scroll(By scrol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scrol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // --------- Methods ---------
    // verify discover screen
    public void verify_explore_communities_btn_on_discover_screen() throws InterruptedException {
        waiiit(explore_community_btn);
        word = driver.findElement(explore_community_btn).getText();
        System.out.println(word);
        Assert.assertEquals("Explore Communities", word);
    }

    // click explore communties button on discover
    public void click_explore_communities_btn() throws InterruptedException {
        waiiit(explore_community_btn);
        driver.findElement(explore_community_btn).click();
    }

    // click my feed tab
    public void click_my_feed_tab() throws InterruptedException {
        waiiit(my_feed_tab_btn);
        driver.findElement(my_feed_tab_btn).click();
    }

    // click profile icon
    public void click_profile_icon_discover() throws InterruptedException {
        waiiit(profile_icon);
        driver.findElement(profile_icon).click();
    }

    // click post card
    public void click_post_card_discover() throws InterruptedException {
        waiiit(post_card);
        driver.findElement(post_card).click();
    }

    // click bookmark button on post card
    public void click_bookmark_btn_on_post_card() throws InterruptedException {
        waiiit(bookmark_btn);
        driver.findElement(bookmark_btn).click();
    }

    // scroll to the 10th post on discover
    public void scroll_to_tenth_post() throws InterruptedException {
        waiiit(tenth_post);
        scroll(tenth_post);
    }

    // click back to top button
    public void click_back_to_top_btn() throws InterruptedException {
        waiiit(back_to_top_btn);
        driver.findElement(back_to_top_btn).click();
    }

}
