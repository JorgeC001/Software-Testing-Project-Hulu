import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SignInTest {
    @Test
    void huluWelcomePage() {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.hulu.com/welcome");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/nav/div[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\\'login-modal\\']/div[2]/div[2]/div/div/div[3]/label/div[2]/input")).sendKeys("Username");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[4]")).sendKeys("Password");
    }
}
