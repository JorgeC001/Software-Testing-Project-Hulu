import io.github.cdimascio.dotenv.Dotenv;
import lombok.SneakyThrows;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	protected final Integer SLEEP_TIME = 5000;
	protected final Integer SHORT_SLEEP_TIME = SLEEP_TIME/2;
	protected final String HUB_URL = "https://www.hulu.com/hub/home";

	protected final WebDriver driver = Main.getDriver();
	protected final WebDriverWait wait = Main.getWait();
	protected final WebDriverWait longWait = Main.getLongWait();
	protected final Dotenv dotenv = Main.getDotenv();
	protected final JavascriptExecutor js = (JavascriptExecutor) driver;


	protected void clickThenSleep(By by) {
		clickThenSleep(by, SLEEP_TIME);
	}

	@SneakyThrows
	protected void clickThenSleep(By by, int time) {
		driver.findElement(by).click();
		Thread.sleep(time);
	}

	protected boolean isOnMainPage() {
		System.out.println("isOnMainPage...");
		return driver.getCurrentUrl().contains(HUB_URL);
	}

	protected boolean isNotOnMainPage() {
		System.out.println("isNotOnMainPage...");
		return !isOnMainPage();
	}

	protected void goToMainPage() {
		System.out.println("goToMainPage...");
		WebElement logo = driver.findElement(By.cssSelector("#__next > header > nav > a"));

		if (!logo.isEnabled() || !logo.isDisplayed()) {
			driver.get(HUB_URL);
		} else {
			try {
				logo.click();
			} catch (ElementClickInterceptedException e) {
				driver.get(HUB_URL);
			}
		}

		if (isNotOnMainPage()) {
			driver.get(HUB_URL);
		}
	}
}
