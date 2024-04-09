import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContinueWatchingTest {
	private final WebDriver driver = Main.getDriver();
	private final WebDriverWait wait = Main.getWait();
	private final Dotenv dotenv = Main.getDotenv();
	private final int expected = Integer.parseInt(dotenv.get("HULU_CONTINUE_WATCHING"));

	@BeforeTest
	void setup() {
		if (!Main.isOnMainPage()) {
			Main.goToMainPage();
		}
	}

	@Test(priority = 1)
	public void continueWatching() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Continue Watching']")));

		By viewAll = By.xpath("//a[@href='/hub/home/collection/282']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewAll));
		driver.findElement(viewAll).click();

		int amount = driver.findElements(By.cssSelector("div.AllUpGrid__generic-tile")).size();

		Assert.assertEquals(amount, expected);
	}
}
