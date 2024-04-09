import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SearchTest {
    private final Login login = Main.getLogin();
    private final WebDriver driver = Main.getDriver();
    private final WebDriverWait wait = Main.getWait();

    @Test(priority = 1)
    void searchByTitle() throws InterruptedException{
        driver.get("https://www.hulu.com/welcome");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/nav/div[2]/a")).click();

        // Username (when visible)
        By username = By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[3]/label/div[2]/input");
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));
        driver.findElement(username)
                .sendKeys(login.username());

        // Password
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[4]/label/div[2]/input"))
                .sendKeys(login.password());

        Thread.sleep(1000);
        // Login button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/button")).click();
        Thread.sleep(1000);

        // Clicks on search button
        By searchButton = By.xpath("/html/body/div[2]/header/nav/div/a");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        driver.findElement(searchButton).click();
        Thread.sleep(1000);

        // Type search query
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Snowfall");
        Thread.sleep(1500);

        // Click on clear search button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/button")).click();
        Thread.sleep(1500);

        // Type new search query
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/input")).sendKeys("Jumanji");
        Thread.sleep(1500);

        // Click clear search again
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/button")).click();
        Thread.sleep(1500);
    }

    @Test(priority = 2)
    void searchByBrowseLink() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down until movies link is found
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        // Click on Movies link
        driver.findElement(By.linkText("Movies")).click();
        Thread.sleep(2000);

        // Click on search button
        driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/a")).click();
        Thread.sleep(2000);

        // Scroll down until tv shows link is found
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        // Click on TV Shows link
        driver.findElement(By.linkText("TV Shows")).click();
        Thread.sleep(2000);

        // Click on VIEW ALL link to display for you results
        driver.findElement(By.linkText("VIEW ALL")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    void searchByGenre() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.hulu.com/search");
        Thread.sleep(2000);

        WebElement actionAdventureButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/button"));
        js.executeScript("arguments[0].scrollIntoView();", actionAdventureButton);
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/div/div/div[1]/div/button")).click();
        Thread.sleep(2000);

    }
}
