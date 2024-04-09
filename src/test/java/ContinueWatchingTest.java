import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContinueWatchingTest extends BaseTest {
	private final int expected = Integer.parseInt(dotenv.get("HULU_CONTINUE_WATCHING"));

	@BeforeMethod
	void setup() {
		System.out.println("ContinueWatchingTest setup...");
		if (isNotOnMainPage()) {
			goToMainPage();
		}
	}

	@Test(dependsOnGroups = {"signIn"}, priority = 8, groups = "continueWatching")
	public void continueWatching() throws InterruptedException {
		System.out.println("ContinueWatchingTest case...");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Welcome to Hulu']")));
		Thread.sleep(SLEEP_TIME);
		js.executeScript("window.scrollTo(0, 1500)");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Continue Watching']")));

		By viewAll = By.xpath("//a[@href='/hub/home/collection/282']");
		wait.until(ExpectedConditions.visibilityOfElementLocated(viewAll));
		driver.findElement(viewAll).click();

		int amount = driver.findElements(By.cssSelector("div.AllUpGrid__generic-tile")).size();

		Assert.assertEquals(amount, expected);

		Thread.sleep(SLEEP_TIME);
	}
}
