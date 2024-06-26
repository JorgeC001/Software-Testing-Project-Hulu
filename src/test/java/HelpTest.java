import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelpTest extends BaseTest {

    @BeforeMethod
    void setUp() {
        System.out.println("Setup help test");
        driver.get("https://help.hulu.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 15, groups = "help")
    void helpSearch() throws InterruptedException{
        System.out.println("help search");

        // Type issue in the search bar
        driver.findElement(By.cssSelector(".slds-input")).sendKeys("payment");
        Thread.sleep(SLEEP_TIME);

        // Press enter to start search
        driver.findElement(By.cssSelector(".slds-input")).sendKeys(Keys.ENTER);
        Thread.sleep(SLEEP_TIME);
        System.out.println("done with help search");
    }

    @Test(priority = 16, groups = "help")
    void helpPopularArticles() {
        clickThenSleep(By.linkText("Plans and pricing"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);

        clickThenSleep(By.linkText("Update payment"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);

        clickThenSleep(By.linkText("Manage activated devices"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);

        clickThenSleep(By.linkText("Login issues"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);

        clickThenSleep(By.linkText("Live TV Home network"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);

        clickThenSleep(By.linkText("Activate Hulu and ESPN+"));

        clickThenSleep(By.linkText("Help Center"), SHORT_SLEEP_TIME);
    }

    @Test(priority = 17, groups = "help")
    void helpTopics() {
        // Click on the Getting Started topic
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/webruntime-component-container/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_topic-home/c-dtcvx_topic/div/a[1]/div"), SHORT_SLEEP_TIME);

        // Click on the sign-up option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);

        // Click on the account and billing topic
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[2]"), SHORT_SLEEP_TIME);

        // Click on the billing option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);
        // Click on the plans and add-ons topic
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[3]"), SHORT_SLEEP_TIME);

        // Click on the disney bundle option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);

        // Click on the fix a problem topic
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[4]"), SHORT_SLEEP_TIME);

        // Click on the login and access option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);

        // Click on the using hulu topic
       clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[5]"), SHORT_SLEEP_TIME);

        // Click on the devices option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);

        // Click on the tv, channels, and movies topic
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[6]"), SHORT_SLEEP_TIME);

        // Click on the tv and movie availability option
        clickThenSleep(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"), SHORT_SLEEP_TIME);
    }
}
