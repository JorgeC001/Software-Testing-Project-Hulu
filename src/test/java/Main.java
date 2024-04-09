import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static WebDriverWait longWait;
    private static boolean driverSetup = false;
    @Getter
    private static final Dotenv dotenv = Dotenv.load();
    @Getter
    private static final Login login = new Login(
            dotenv.get("HULU_USERNAME"),
            dotenv.get("HULU_PASSWORD"),
            dotenv.get("HULU_PROFILE")
    );

    public static WebDriver getDriver() {
        if (!driverSetup) {
            WebDriverManager.firefoxdriver();
            driver = new FirefoxDriver();
            
            driver.manage().timeouts().implicitlyWait(Duration.of(120, ChronoUnit.SECONDS));
            
            driverSetup = true;
        }
        return driver;
    }
    
    @NonNull
    public static WebDriverWait getWait() {
        if (wait == null) {
            // to give time for getting email confirmation, we need to set the time pretty high
            wait = new WebDriverWait(getDriver(), Duration.of(8, ChronoUnit.SECONDS));
        }
        
        return wait;
    }

    @NonNull
    public static WebDriverWait getLongWait() {
        if (longWait == null) {
            // to give time for getting email confirmation, we need to set the time pretty high
            longWait = new WebDriverWait(getDriver(), Duration.of(120, ChronoUnit.SECONDS));
        }

        return longWait;
    }
}
