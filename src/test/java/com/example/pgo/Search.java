package com.example.pgo;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
    WebDriver driver;
    String word;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By search_all = By.xpath("//*[@id='hoverEffect-0']/button");
    By search_community = By.xpath("//*[@id='hoverEffect-1']/button");
    By view_all = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[4]/div[2]/button");
    By community = By.xpath("//*[@id='post-2']");
    By search_input = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/form/input");
    By search_back = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");
    By search_community_name_all = By.xpath("//*[@id='post-0']/div/div/div/div[2]/h2");
    By search_community_name_communities = By.xpath("//*[@id='post-0']/div/div/div[1]/div[2]/h2");
    By join_community = By.xpath("//*[@id='post-0']/div/div/div[2]/button");
    By scroll_community = By.xpath("//*[@id='post-8']");

    // -------- Important ------------
    public void waiiit(By wwt) throws InterruptedException {
        try {
            if (driver.findElement(wwt).isDisplayed()) {
                return;
            }
        } catch (Exception e) {
            Thread.sleep(3000);
            return;
        }
    }

    public void scroll(By scol) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(scol);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    // -------- Guest User ------------
    public void verify_open_search_all() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(search_all);
        word = driver.findElement(search_all).getText();
        System.out.println(word);
        Assert.assertEquals("All", word);
    }

    public void search_community_all() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search_input);
        driver.findElement(search_input).clear();
        driver.findElement(search_input).sendKeys("sports");
        Thread.sleep(5000);
        word = driver.findElement(search_community_name_all).getText();
        String cw = "Sports";
        boolean contain_word = word.contains(cw);
        System.out.println(word);
        Assert.assertEquals(true, contain_word);
        // if (contain_word) {
        // System.out.println("true");
        // } else {
        // fail();
        // }
    }

    public void search_community_communities() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(search_input);
        driver.findElement(search_input).clear();
        driver.findElement(search_input).sendKeys("sports");
        Thread.sleep(3000);
        word = driver.findElement(search_community_name_communities).getText();
        String cw = "Sports";
        boolean contain_word = word.contains(cw);
        System.out.println(word);
        Assert.assertEquals(true, contain_word);
    }

    public void click_view_all() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(view_all);
        driver.findElement(view_all).click();
    }

    public void click_communities_sub() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search_community);
        driver.findElement(search_community).click();
    }

    public void verify_open_search_communities() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search_community);
        boolean t = driver.findElement(join_community).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(true, t);
    }

    public void click_join_communities() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(join_community);
        driver.findElement(join_community).click();
    }

    public void open_community_all() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search_community_name_all);
        driver.findElement(search_community_name_all).click();
    }

    public void open_community_communities() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search_community_name_communities);
        driver.findElement(search_community_name_communities).click();
    }

    public void open_community_pagination() throws InterruptedException {
        Thread.sleep(4000);
        waiiit(scroll_community);
        scroll(community);
        waiiit(scroll_community);
        driver.findElement(scroll_community).click();
        Thread.sleep(6000);
    }

    public void verify_pagination() throws InterruptedException {
        waiiit(scroll_community);
        boolean t;
        t = driver.findElement(scroll_community).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(t, true);
    }
}
