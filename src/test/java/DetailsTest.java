import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DetailsTest extends BaseTest {
    @Test(dependsOnGroups = {"signIn"},priority = 10, groups = "details")
    void addToMyStuffButton() throws InterruptedException{
        System.out.println("addToMyStuffButton...");
        // Click on the search button
        driver.get("https://www.hulu.com/series/3529d0f1-acaf-476d-8be3-66cd6bf12530");
        Thread.sleep(SLEEP_TIME);

        // Click the add to my stuff button
        clickThenSleep(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[4]/div/div[3]/div/button"));
        // Click again to remove from my stuff
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[4]/div/div[3]/div/button"))
                .click();
        Thread.sleep(2000);
    }

    @Test(dependsOnGroups = {"signIn"},priority = 11, groups = "details")
    void likeDislikeButtons() throws InterruptedException{
        System.out.println("likeDislikeButtons...");
        // Click on the three dots button
        driver.findElement(By.cssSelector(".gwbyix0")).click();
        Thread.sleep(2000);

        // Click on the like button
        driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[1]/button")).click();
        Thread.sleep(2000);

        // Click on the dislike button
        driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]/button")).click();
        Thread.sleep(2000);

        // Click the Okay option on dislike popup
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/button[1]")).click();
        Thread.sleep(2000);

        //Click on the dislike button
        driver.findElement(By.xpath("/html/body/div[5]/div/ul/li[2]/button")).click();
        Thread.sleep(2000);

        // Click on the Cancel option on dislike popup
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[2]/button[2]")).click();
        Thread.sleep(2000);

    }

    @Test(dependsOnGroups = {"signIn"},priority = 12, groups = "details")
    void watchPartyButton() throws InterruptedException{
        System.out.println("watchPartyButton...");
        // Clicks on the start watch party button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[4]/div/div[2]/div/button"))
                .click();
        Thread.sleep(2000);

        // Clicks on the maybe later button
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div[3]/button[2]")).click();
        Thread.sleep(2000);
    }

    @Test(dependsOnGroups = {"signIn"},priority = 13, groups = "details")
    void seasonsDropdown() throws InterruptedException{
        System.out.println("seasonsDropdown...");
        Thread.sleep(SHORT_SLEEP_TIME);
        // Clicks on the seasons dropdown
        driver.findElement(By.cssSelector(".Select")).click();
        Thread.sleep(SHORT_SLEEP_TIME);

        // Attempts to select a season in the dropdown
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[4]/div/div[1]/div"));
        Select drop = new Select(dropdown);
        drop.selectByIndex(1);
        Thread.sleep(3000);
    }

    @Test(dependsOnGroups = {"signIn"},priority = 14, groups = "details")
    void detailsTabs() throws InterruptedException{
        System.out.println("detailsTabs...");
        // Click on the "You May Also Like" button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[4]/div/span/button")).click();
        Thread.sleep(2000);

        // Click on the "Extras" button
        driver.findElement(By.id("Extras")).click();
        Thread.sleep(2000);

        // Click on the "Details" button
        driver.findElement(By.id("Details")).click();
        Thread.sleep(2000);
    }
}
