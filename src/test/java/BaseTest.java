import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	private final Integer SLEEP_TIME = 2000;
	protected final String HUB_URL = "www.hulu.com/hub/home";

	protected final WebDriver driver = Main.getDriver();
	protected final WebDriverWait wait = Main.getWait();
	protected final WebDriverWait longWait = Main.getLongWait();
	protected final Dotenv dotenv = Main.getDotenv();

	protected void clickThenSleep(By by) {
		driver.findElement(by).click();
		try {
			Thread.sleep(SLEEP_TIME);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	protected boolean isOnMainPage() {
		return driver.getCurrentUrl().contains(HUB_URL);
	}

	protected boolean isNotOnMainPage() {
		return !isOnMainPage();
	}

	protected void goToMainPage() {
		WebElement logo = driver.findElement(By.cssSelector("#__next > header > nav > a"));

		if (!logo.isEnabled() || !logo.isDisplayed()) {
			driver.get(HUB_URL);
		} else {
			logo.click();
		}

		if (isNotOnMainPage()) {
			driver.get(HUB_URL);
		}
	}
}
