import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignInTest {
    private final Login login = Main.getLogin();
    private final WebDriver driver = Main.getDriver();
    private final WebDriverWait wait = Main.getWait();
    
    @Test(priority = -2, groups = "signIn")
    void huluWelcomePage() throws InterruptedException {
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
        
        Thread.sleep(500);
        // Login button
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/button")).click();
        
        Thread.sleep(1000);
        // Select profile (when visible)
        By profile = By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[" + login.profileNumber() + "]/a/span");
        wait.until(ExpectedConditions.visibilityOfElementLocated(profile));
        WebElement profileElement = driver.findElement(profile);
        
        Actions actions = new Actions(driver);
        actions.moveToElement(profileElement).click().perform();
    }

    @Test(priority = -1, groups = "signIn")
    void huluProfilePage() {

    }
}
