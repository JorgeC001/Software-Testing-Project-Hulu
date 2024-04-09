import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends  BaseTest {
    @Test(dependsOnGroups = {"signIn"}, priority = 1, groups = "search")
    void searchByTitle() throws InterruptedException{
        System.out.println("searchByTitle...");
        if (isNotOnMainPage()) {
            goToMainPage();
        }
        // Clicks on search button
        By searchButton = By.xpath("/html/body/div[2]/header/nav/div/a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        driver.findElement(searchButton).click();
        Thread.sleep(SHORT_SLEEP_TIME);

        // Type search query
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Snowfall");
        Thread.sleep(SHORT_SLEEP_TIME);

        // Click on clear search button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/button")).click();
        Thread.sleep(SHORT_SLEEP_TIME);

        // Type new search query
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Jumanji");
        Thread.sleep(SHORT_SLEEP_TIME);

        // Click clear search again
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/button")).click();
        Thread.sleep(SHORT_SLEEP_TIME);
    }

    @Test(dependsOnGroups = {"signIn"}, priority = 2, groups = "search")
    void searchByBrowseLink() throws InterruptedException{
        System.out.println("searchByBrowseLink...");
        // Scroll down until movies link is found
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(SLEEP_TIME);

        // Click on Movies link
        driver.findElement(By.linkText("Movies")).click();
        Thread.sleep(SLEEP_TIME);

        // Click on search button
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/a")).click();
        Thread.sleep(SLEEP_TIME);

        // Scroll down until tv shows link is found
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(SLEEP_TIME);

        // Click on TV Shows link
        driver.findElement(By.linkText("TV Shows")).click();
        Thread.sleep(SLEEP_TIME);

        // Click on VIEW ALL link to display for you results
        driver.findElement(By.linkText("VIEW ALL")).click();
        Thread.sleep(SLEEP_TIME);
    }

    @Test(dependsOnGroups = {"signIn"}, priority = 3, groups = "search")
    void searchByGenre() throws InterruptedException{
        System.out.println("searchByGenre...");
        driver.get("https://www.hulu.com/search");
        Thread.sleep(SLEEP_TIME);

        WebElement actionAdventureButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/button"));
        js.executeScript("arguments[0].scrollIntoView();", actionAdventureButton);
        Thread.sleep(SLEEP_TIME);

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/button")).click();
        Thread.sleep(SLEEP_TIME);
    }
}
