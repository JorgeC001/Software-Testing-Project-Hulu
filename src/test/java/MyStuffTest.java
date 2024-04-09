import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyStuffTest {
	private final WebDriver driver = Main.getDriver();
	private final WebDriverWait wait = Main.getWait();
	private final Dotenv dotenv = Main.getDotenv();
	private final int expected = Integer.parseInt(dotenv.get("HULU_MY_STUFF"));

	@BeforeTest
	void setup() {
		if (!Main.isOnMainPage()) {
			Main.goToMainPage();
		}
	}

	@Test(priority = 1)
	public void myStuffTest() {
		driver.findElement(By.linkText("My Stuff")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#__next > div.LevelOne.cu-levelone > div.MyStuff > div.MyStuffBanner > div.MyStuffBanner__container.Container > div > div > h1"))));

		var test = driver.findElements(By.cssSelector("div.Tile__rollover"));

		Assert.assertEquals(test.size(), expected);
	}
}
