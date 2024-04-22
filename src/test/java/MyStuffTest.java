import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyStuffTest extends BaseTest {
	private final WebDriver driver = Main.getDriver();
	private final WebDriverWait wait = Main.getWait();
	private final Dotenv dotenv = Main.getDotenv();
	private final int expected = Integer.parseInt(dotenv.get("HULU_MY_STUFF"));

	// Make sure we're on the home page
	@BeforeMethod
	void setup() {
		System.out.println("MyStuffTest setup...");
		driver.get(HUB_URL);
	}

	@Test(dependsOnGroups = {"signIn"}, priority = 9, groups = "myStuff")
	public void myStuffTest() throws InterruptedException {
		Thread.sleep(SLEEP_TIME);
		// Look for the My Stuff link in the header
		driver.findElement(By.linkText("My Stuff")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#__next > div.LevelOne.cu-levelone > div.MyStuff > div.MyStuffBanner > div.MyStuffBanner__container.Container > div > div > h1"))));

		// check to make sure we have the expected amount of shows
		var test = driver.findElements(By.cssSelector("div.Tile__rollover"));

		Assert.assertEquals(test.size(), expected);
	}
}
