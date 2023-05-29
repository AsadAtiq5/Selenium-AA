package com.example.PageObjects;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommunityDetail {
    WebDriver driver;
    String word;

    public CommunityDetail(WebDriver driver) {
        this.driver = driver;
    }

    // Xpaths:
    By back_arrow = By.xpath("//*[@id='root']/div[2]/div[1]/div[1]/div/div/button/img");
    By join_community = By.xpath("//*[@id='root']/div[2]/div[2]/div[5]/div/div[2]/div[1]/div[1]/div[2]/div[1]/button");

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
}
