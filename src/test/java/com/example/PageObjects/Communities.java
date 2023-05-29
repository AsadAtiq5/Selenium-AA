package com.example.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Communities {
    WebDriver driver;
    String word;

    public Communities(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By page = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/h1");
    By join_communities = By.xpath("//*[@id='post-0']/div/div/div[2]/button");
    By search = By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/button/img");
    By category_filter = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[1]/div/div/div/div[15]/span/span");
    By filter = By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/h2");
    By filter_search = By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/input");
    By filter_search_result = By.xpath("/html/body/div[3]/div/div/div[2]/div/div/label");
    By filter_cross = By.xpath("/html/body/div[3]/div/div/div[1]/div[1]/span/img");
    By filter_all = By.xpath("/html/body/div[3]/div/div/div[2]/div[1]/div/label");
    By error_toast = By.xpath("//*[@id='error']/div[1]/div[2]");
    By category = By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/label");
    By after_select_category = By
            .xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[1]/div/div/div/div[1]/span/span[1]");
    By pagination_community = By.xpath("//*[@id='post-10']");

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
    public void verify_page() throws InterruptedException {
        waiiit(page);
        word = driver.findElement(page).getText();
        System.out.println(word);
        Assert.assertEquals("Communities", word);
    }

    public void click_join_communities() throws InterruptedException {
        waiiit(join_communities);
        driver.findElement(join_communities).click();
    }

    public void click_search() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(search);
        driver.findElement(search).click();
    }

    public void click_category_filter() throws InterruptedException {
        waiiit(category_filter);
        driver.findElement(category_filter).click();
    }

    public void verify_category_filter() throws InterruptedException {
        waiiit(filter);
        word = driver.findElement(filter).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Categories", word);
    }

    public void verify_filter_search() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(filter_search);
        driver.findElement(filter_search).sendKeys("Health");
        Thread.sleep(5000);
        waiiit(filter_search_result);
        word = driver.findElement(filter_search_result).getText();
        System.out.println(word);
        Assert.assertEquals("Health and Fitness (1)", word);
    }

    public void click_filter_cross() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(filter_cross);
        driver.findElement(filter_cross).click();
    }

    public void click_filter_all() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(filter_all);
        driver.findElement(filter_all).click();
    }

    public void verify_error_toast() throws InterruptedException {
        // Thread.sleep(1000);
        waiiit(error_toast);
        word = driver.findElement(error_toast).getAccessibleName();
        System.out.println(word);
        Assert.assertEquals("Please select a category.", word);
    }

    public void click_category() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(category);
        driver.findElement(category).click();
    }

    public void verify_selected_category() throws InterruptedException {
        Thread.sleep(3000);
        waiiit(after_select_category);
        word = driver.findElement(after_select_category).getText();
        System.out.println("word = " + word);
        Assert.assertEquals("Artificial Intelligence", word);
    }

    public void Open_community_pagination() throws InterruptedException {
        Thread.sleep(5000);
        waiiit(pagination_community);
        scroll(pagination_community);
        waiiit(pagination_community);
        driver.findElement(pagination_community).click();
    }

    public void verify_pagination() throws InterruptedException {
        waiiit(pagination_community);
        boolean t;
        t = driver.findElement(pagination_community).isDisplayed();
        System.out.println(t);
        Assert.assertEquals(t, true);
    }

}
