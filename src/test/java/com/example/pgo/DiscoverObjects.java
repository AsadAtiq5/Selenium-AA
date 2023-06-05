package com.example.pgo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DiscoverObjects {
    WebDriver driver;
    String word;

    public DiscoverObjects(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By splash_next = By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/button[2]");
    By explore_communities = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/div[1]/div[1]/a/button");
    By G_User_icon = By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/img");
    By signup_icon = By.xpath("//*[@id='root']/div[2]/div[4]/div/div/h1");
    By my_feed = By.xpath("//*[@id='hoverEffect-0']/button");
    By signup_feed = By.xpath("//h1[normalize-space()='Please sign up to access this feature']");
    By Bookmark = By.xpath("// *[@id='dashboardListing-0']/div/div[2]/ul[2]/li/img");
    By Postcard = By.xpath("//*[@id='dashboardListing-0']/div");
    By visit_website = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/a/button");
    By last_post = By.xpath("//*[@id='dashboardListing-9']");
    By sendlast_post = By.xpath("//*[@id='dashboardListing-6']");
    By cross_signup = By.xpath("//*[@id='root']/div[2]/div[4]/button");
    By scroll_to_top = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[2]/div[1]/div[12]/button");
    By Bookmark_pd = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[1]/img");
    By Like_pd = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[2]/li[1]/span/span[1]/img");
    By Dislike_pd = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[3]/ul[1]/span[2]/li[1]/span/span[2]/img");
    By G_user_icon_pd = By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/img");
    By back_arrow_pd = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");
    // Methods:

    // ------------- Important -----------------
    public void dimensionss() {
        Dimension dimension = new Dimension(290, 1044);
        driver.manage().window().setSize(dimension);
    }

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

    public void Splash_nextt() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(splash_next);
        driver.findElement(splash_next).click();
    }

    public void scroll(By scol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // ------------- Guest User -----------------

    public void verify_page() throws InterruptedException {
        waiiit(explore_communities);
        word = driver.findElement(explore_communities).getText();
        System.out.println(word);
        Assert.assertEquals("Explore Communities", word);
    }

    public void click_explore_communities() throws InterruptedException {
        waiiit(explore_communities);
        driver.findElement(explore_communities).click();
    }

    public void click_G_user_icon() throws InterruptedException {
        waiiit(G_User_icon);
        driver.findElement(G_User_icon).click();
    }

    public void verify_signup_icon() throws InterruptedException {
        waiiit(signup_icon);
        word = driver.findElement(signup_icon).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals(
                "The profile feature is only available for registered users, register today to set up your profile",
                word);
    }

    public void click_my_feed() throws InterruptedException {
        Thread.sleep(6000);
        waiiit(my_feed);
        driver.findElement(my_feed).click();
    }

    public void verify_signup_feed() throws InterruptedException {
        waiiit(signup_feed);
        word = driver.findElement(signup_feed).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Please sign up to access this feature", word);
    }

    public void click_bookmark() throws InterruptedException {
        waiiit(Bookmark);
        driver.findElement(Bookmark).click();
    }

    public void click_postcard() throws InterruptedException {
        waiiit(Postcard);
        driver.findElement(Postcard).click();
    }

    public void verify_post_detail() throws InterruptedException {
        waiiit(visit_website);
        word = driver.findElement(visit_website).getText();
        System.out.println(word);
        Assert.assertEquals("Visit Website", word);
    }

    public void scroll_last_post() throws InterruptedException {
        waiiit(last_post);
        scroll(last_post);
    }

    public void verify_signup_post() throws InterruptedException {
        waiiit(signup_icon);
        word = driver.findElement(signup_icon).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Please sign up to view more posts", word);
    }

    public void click_cross_signup() throws InterruptedException {
        waiiit(cross_signup);
        driver.findElement(cross_signup).click();
    }

    public void click_scroll_to_top() throws InterruptedException {
        waiiit(scroll_to_top);
        driver.findElement(scroll_to_top).click();
    }

}
