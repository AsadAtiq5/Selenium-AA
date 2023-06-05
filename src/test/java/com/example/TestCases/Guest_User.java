package com.example.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.example.pgo.Communities;
import com.example.pgo.CommunityDetail;
import com.example.pgo.DiscoverObjects;
import com.example.pgo.PostDetail;
import com.example.pgo.Search;

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
    public void verify_discover_tab_on_open_app() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.verify_page();
        quit();
    }

    @Test(priority = 2)
    public void verify_signup_popup_text_on_clicking_guser_icon() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_G_user_icon();
        ds.verify_signup_icon();
        quit();
    }

    @Test(priority = 3)
    public void verify_signup_popuo_text_on_clicking_MyFeed() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_my_feed();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 4)
    public void verify_open_postDetail_on_clicking_postCard() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_postcard();
        ds.verify_post_detail();
        quit();
    }

    @Test(priority = 5)
    public void verify_signup_popup_text_on_clicking_bookmark_on_postCard() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_bookmark();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 6)
    public void verify_signup_popup_when_view_10_posts_on_Discover() throws InterruptedException {
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
    public void verify_signup_popup_on_clicking_bookmark_on_postDetail() throws InterruptedException {
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
    public void verify_signup_popup_on_clicking_like_on_postDetail() throws InterruptedException {
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
    public void verify_signup_popup_on_clicking_dislike_on_postDetail() throws InterruptedException {
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
    public void verify_signup_popup_text_on_clicking_guser_icon_on_postDetail() throws InterruptedException {
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
    public void verify_discover_on_clicking_backArrow_on_postDetail() throws InterruptedException {
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
    public void verify_community_listing_on_clicking_explore_communities_on_discover() throws InterruptedException {
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
    public void verify_signup_modal_on_clicking_join_communtiy() throws InterruptedException {
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
    public void verify_category_filter_on_clicking_category() throws InterruptedException {
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
    public void verify_search_category_on_category_filter() throws InterruptedException {
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
    @Test(priority = 27)
    public void Verify_open_community_detail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.verify_about_sub();
        quit();
    }

    @Test(priority = 28)
    public void Verify_open_cd_post() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.click_post_sub();
        cd.verify_post_sub();
        quit();
    }

    @Test(priority = 29)
    public void verify_postDetail_on_clicking_post_on_postSub() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        PostDetail pd = new PostDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.click_post_sub();
        cd.open_post();
        pd.verify_open_pd();
        quit();
    }

    @Test(priority = 30)
    public void verify_signup_modal_on_clicking_like_on_communityDetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.click_post_sub();
        cd.scrilll();
        cd.click_like_post();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 31)
    public void verify_signup_modal_on_clicking_dislike_on_communityDetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.click_post_sub();
        cd.scrilll();
        cd.click_dislike_post();
        ds.verify_signup_feed();
        quit();
    }

    @Test(priority = 32)
    public void verify_signup_modal_on_clicking_bookmark_on_communityDetail() throws InterruptedException {
        setup();
        DiscoverObjects ds = new DiscoverObjects(driver);
        Communities cl = new Communities(driver);
        CommunityDetail cd = new CommunityDetail(driver);
        ds.Splash_nextt();
        ds.dimensionss();
        ds.click_explore_communities();
        cl.open_community();
        cd.click_post_sub();
        cd.scrilll();
        cd.click_bookmark_post();
        ds.verify_signup_feed();
        quit();
    }

    // -------------- Community invite Modal -------------
    @Test(priority = 33)
    public void verify_community_invite_modal_wheen_open_community_invitation_link() throws InterruptedException {
        setup();
        CommunityDetail cd = new CommunityDetail(driver);
        DiscoverObjects ds = new DiscoverObjects(driver);
        cd.open_community_invite();
        ds.dimensionss();
        cd.verify_community_invite_modal();
        quit();
    }

    @Test(priority = 34)
    public void verify_open_communityDetail_on_clicking_BrowserCommunnity_on_invite_modal()
            throws InterruptedException {
        setup();
        CommunityDetail cd = new CommunityDetail(driver);
        DiscoverObjects ds = new DiscoverObjects(driver);
        cd.open_community_invite();
        ds.dimensionss();
        cd.click_browse_community();
        cd.verify_about_sub();
        quit();
    }

    @Test(priority = 35)
    public void verify_open_communityDetail_on_clicking_cross_on_invite_modal() throws InterruptedException {
        setup();
        CommunityDetail cd = new CommunityDetail(driver);
        DiscoverObjects ds = new DiscoverObjects(driver);
        cd.open_community_invite();
        ds.dimensionss();
        cd.click_cross_btn();
        cd.verify_about_sub();
        quit();
    }
}
