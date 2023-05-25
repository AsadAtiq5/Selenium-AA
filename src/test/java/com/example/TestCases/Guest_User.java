package com.example.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.PageObjects.Communities;
import com.example.PageObjects.DiscoverObjects;
import com.example.PageObjects.PostDetail;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guest_User {
    WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.aa-stage.global-drum.com/");
    }

    public void quit() {
        driver.quit();
    }

    // -------------- Discover screen -------------
    @Test(priority = 1)
    public void open_application() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.verify_page();
        quit();
    }

    @Test(priority = 2)
    public void Verify_Click_Guest_user_icon() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_G_user_icon();
        ds.verify_signup_icon();
        quit();
    }

    @Test(priority = 3)
    public void Verify_Click_MyFeed() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_my_feed();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 4)
    public void Verify_Click_Postcard() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        ds.verify_post_detail();
        quit();
    }

    @Test(priority = 5)
    public void Verify_Click_Bookmark() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_bookmark();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 6)
    public void Verify_10_Posts_discover() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.scroll();
        ds.verify_signup_post();
        quit();
    }

    @Test(priority = 7)
    public void Verify_scroll_to_top() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.scroller();
        ds.click_scroll_to_top();
        ds.verify_page();
        quit();
    }

    // -------------- Post Detail screen -------------
    @Test(priority = 8)
    public void Verify_click_Bookmark_postdetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        pd.click_bookmark();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 9)
    public void Verify_click_Like_postdetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        pd.click_Like();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 10)
    public void Verify_click_Dislike_postdetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        pd.click_Dislike();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 11)
    public void Verify_click_Guest_user_icon_postdetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        pd.click_g_user_icon();
        ds.verify_signup_icon();
        quit();
    }

    @Test(priority = 12)
    public void Verify_Click_back_arrow_postDetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        pd.click_back_arrow();
        ds.verify_page();
        quit();
    }

    // -------------- Community Listing screen -------------
    @Test(priority = 13)
    public void Verify_Open_Community_Listing() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.verify_page();
        quit();
    }

    @Test(priority = 14)
    public void Verify_Click_join_communities() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_join_communities();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 15)
    public void Verify_Click_categories() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_category_filter();
        cl.verify_category_filter();
        quit();
    }

    @Test(priority = 16)
    public void Verify_search_category() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_category_filter();
        cl.verify_filter_search();
        quit();
    }

    @Test(priority = 17)
    public void Verify_unselect_all_categories() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_category_filter();
        cl.click_filter_all();
        cl.click_filter_cross();
        cl.verify_category_filter();
        quit();
    }

    @Test(priority = 18)
    public void Veify_selected_category_from_filter() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_category_filter();
        cl.click_filter_all();
        cl.click_category();
        cl.click_filter_cross();
        cl.verify_selected_category();
        quit();
    }
}
