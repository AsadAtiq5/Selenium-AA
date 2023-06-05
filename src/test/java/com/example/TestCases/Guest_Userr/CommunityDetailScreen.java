package com.example.TestCases.Guest_Userr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.PageObjects.CommunityDetails;
import com.example.PageObjects.CommunityListing;
import com.example.PageObjects.Discover;
import com.example.PageObjects.SearchObjs;
import com.example.PageObjects.SignupModal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommunityDetailScreen {
    // Objects
    WebDriver driver;
    Discover ds;
    CommunityListing cl;
    CommunityDetails cd;
    SignupModal sm;
    SearchObjs ss;

    // Setups
    public void setup() {
        // setup
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        // visit website
        driver.get("https://www.aa-stage.global-drum.com/");

        // Initializing Objects
        ds = new Discover(driver);
        cl = new CommunityListing(driver);
        sm = new SignupModal(driver);
        cd = new CommunityDetails(driver);
        ss = new SearchObjs(driver);
    }

    public void quit() {
        driver.quit();
    }

    // Test Cases
    @Test(priority = 1)
    public void verify_access_to_community_detail() throws InterruptedException {
        setup();
        ds.click_splash_next_btn();
        ds.set_dimensionss();
        ds.click_explore_communities_btn();
        cl.click_community();
    }

}
