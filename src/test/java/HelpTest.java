import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;

public class HelpTest {
    private final Login login = Main.getLogin();
    private final WebDriver driver = Main.getDriver();
    private final WebDriverWait wait = Main.getWait();

    @Test(priority = 1, groups = "help")
    void helpSearch() throws InterruptedException{
        // Go to the help page
        driver.get("https://help.hulu.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // Type issue in the search bar
        driver.findElement(By.id("input-251")).sendKeys("payment");
        Thread.sleep(2000);

        // Press enter to start search
        driver.findElement(By.id("input-251")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test(priority = 2, groups = "help")
    void helpPopularArticles() throws InterruptedException{
        driver.findElement(By.linkText("Plans and pricing")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Update payment")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Manage activated devices")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Login issues")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Live TV Home network")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Activate Hulu and ESPN+")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Help Center")).click();
        Thread.sleep(1000);

    }

    @Test(priority = 3, groups = "help")
    void helpTopics() throws InterruptedException{
        // Click on the Getting Started topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/webruntime-component-container/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_topic-home/c-dtcvx_topic/div/a[1]/div"))
                .click();
        Thread.sleep(2000);

        // Click on the sign-up option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);

        // Click on the account and billing topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[2]"))
                .click();
        Thread.sleep(2000);

        // Click on the billing option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);

        // Click on the plans and add-ons topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[3]"))
                .click();
        Thread.sleep(2000);

        // Click on the disney bundle option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);

        // Click on the fix a problem topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[4]"))
                .click();
        Thread.sleep(2000);

        // Click on the login and access option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);

        // Click on the using hulu topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[5]"))
                .click();
        Thread.sleep(2000);

        // Click on the devices option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);

        // Click on the tv, channels, and movies topic
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[1]/c-dtcvx_topic/div/a[6]"))
                .click();
        Thread.sleep(2000);

        // Click on the tv and movie availability option
        driver.findElement(By.xpath("/html/body/webruntime-app/lwr-router-container/webruntime-inner-app/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/c-dtcvx_support-theme/div/section/slot/webruntime-router-container/dxp_data_provider-user-data-provider/dxp_data_provider-data-proxy/community_layout-slds-flexible-layout/div/community_layout-section/div[3]/community_layout-column/div/c-dtcvx_article-category-v2/div/div[2]/div[2]/lightning-accordion/div/slot/lightning-accordion-section[1]/div/section/div[1]/h2/button"))
                .click();
        Thread.sleep(2000);
    }
}
