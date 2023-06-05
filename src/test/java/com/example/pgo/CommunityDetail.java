package com.example.pgo;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommunityDetail {
    WebDriver driver;
    String word;

    public CommunityDetail(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By back_arrow = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");
    By join_community = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[1]/div[1]/div[2]/div[1]/button");
    By verify_about_sub = By
            .xpath("//*[@id='root']/div[1]/div[2]/div[5]/div/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/h2");
    By post_sub = By.xpath("//*[@id='hoverEffect-0']/button");
    By verify_post_sub = By.xpath("//*[@id='communityPosts-0']");
    By post = By.xpath("//*[@id='communityPosts-0']/div");
    By like_post = By.xpath("//*[@id='communityPosts-0']/ul/span[2]/li[1]/span/span[1]/img");
    By dislike_post = By.xpath("//*[@id='communityPosts-0']/ul/span[2]/li[1]/span/span[2]/img");
    By bookmark_post = By.xpath("//*[@id='communityPosts-0']/ul/span[1]");
    By scroll_element = By.xpath("//*[@id='communityPosts-0']/div/div[3]/span/img");
    By community_invite_modal = By.xpath("//*[@id='root']/div[1]/div[2]/div[5]/div/div[2]/div[1]/div[5]/div");
    By browse_community = By
            .xpath("//*[@id='root']/div[1]/div[2]/div[5]/div/div[2]/div[1]/div[5]/div/div/div[3]/button");
    By cross_invite_modal = By.xpath("//*[@id='root']/div[1]/div[2]/div[5]/div/div[2]/div[1]/div[5]/button/img");

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

    public void scroll(By scol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // -------- Guest User ------------
    public void click_back_arrow() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(back_arrow);
        driver.findElement(back_arrow).click();
    }

    public void verify_screen() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(join_community);
        if (driver.findElement(join_community).isDisplayed()) {
            System.out.println("true");
        } else {
            fail();
        }
    }

    public void verify_about_sub() throws InterruptedException {
        Thread.sleep(7000);
        waiiit(verify_about_sub);
        word = driver.findElement(verify_about_sub).getText();
        System.out.println(word);
        Assert.assertEquals("Community Info", word);
    }

    public void click_post_sub() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(post_sub);
        driver.findElement(post_sub).click();
    }

    public void verify_post_sub() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(verify_post_sub);
        boolean t = driver.findElement(verify_post_sub).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(true, t);
    }

    public void open_post() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(post);
        driver.findElement(post).click();
    }

    public void click_like_post() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(like_post);
        driver.findElement(like_post).click();
    }

    public void click_dislike_post() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(dislike_post);
        driver.findElement(dislike_post).click();
    }

    public void click_bookmark_post() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(bookmark_post);
        driver.findElement(bookmark_post).click();
    }

    public void scrilll() throws InterruptedException {
        Thread.sleep(2000);
        waiiit(scroll_element);
        scroll(scroll_element);
    }

    public void open_community_invite() throws InterruptedException {
        driver.get("https://www.aa-stage.global-drum.com/community/AI-News=ce604686#welcome");
    }

    public void verify_community_invite_modal() throws InterruptedException {
        Thread.sleep(6000);
        waiiit(community_invite_modal);
        boolean t = driver.findElement(community_invite_modal).isDisplayed();
        Assert.assertEquals(true, t);
    }

    public void click_browse_community() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(browse_community);
        driver.findElement(browse_community).click();
    }

    public void click_cross_btn() throws InterruptedException {
        Thread.sleep(8000);
        waiiit(cross_invite_modal);
        driver.findElement(cross_invite_modal).click();
    }
}
