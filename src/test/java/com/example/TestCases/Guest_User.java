package com.example.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.PageObjects.Communities;
import com.example.PageObjects.CommunityDetail;
import com.example.PageObjects.DiscoverObjects;
import com.example.PageObjects.PostDetail;
import com.example.PageObjects.Search;

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
        ds.scroll_last_post();
        ds.verify_signup_post();
        quit();
    }

    // @Test(priority = 7)
    // public void Verify_scroll_to_top() throws InterruptedException {
    // setup();
    // DiscoverObjects ds = new DiscoverObjects(driver);
    // ds.Splash_nextt();
    // ds.dimensionss();
    // ds.scroller();
    // ds.click_scroll_to_top();
    // ds.verify_page();
    // quit();
    // }

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
    public void Verify_Click_categories_open_filter() throws InterruptedException {
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
    public void Verify_search_category_on_filter() throws InterruptedException {
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
    public void Verify_unselect_all_categories_filter() throws InterruptedException {
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
    public void Verify_selected_category_from_filter() throws InterruptedException {
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

    @Test(priority = 19)
    public void Verify_Pagination_community_listing() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.Open_community_pagination();
        cd.click_back_arrow();
        cl.verify_pagination();
        quit();
    }

    @Test(priority = 20)
    public void Verify_open_search() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.verify_open_search_all();
        quit();
    }

    // -------------- Search screen -------------
    @Test(priority = 21)
    public void Verify_searching() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.search_community_all();
        s.search_community_communities();
        quit();
    }

    @Test(priority = 22)
    public void Verify_view_all_on_search() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.click_view_all();
        s.verify_open_search_communities();
        quit();
    }

    @Test(priority = 23)
    public void Verify_click_join_community() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.click_view_all();
        s.click_join_communities();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 24)
    public void Verify_open_community_from_seearch_All() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.open_community_all();
        cd.verify_screen();
        cd.click_back_arrow();
        s.verify_open_search_all();
        quit();
    }

    @Test(priority = 25)
    public void Verify_open_community_from_search_communities() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.click_communities_sub();
        s.open_community_communities();
        cd.verify_screen();
        cd.click_back_arrow();
        s.verify_open_search_communities();
        quit();
    }

    @Test(priority = 26)
    public void Verify_pagination_search() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        Search s = new Search(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.click_search();
        s.click_communities_sub();
        s.open_community_pagination();
        cd.click_back_arrow();
        s.verify_pagination();
        quit();
    }

    // -------------- Community Detail screen -------------
}
