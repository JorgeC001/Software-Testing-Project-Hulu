import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VideoPlayerTest {
    private final Login login = Main.getLogin();
    private final WebDriver driver = Main.getDriver();
    private final WebDriverWait wait = Main.getWait();

    @Test(priority = 1)
    void playPauseVideo() throws InterruptedException{
        Thread.sleep(1000);

        driver.get("https://www.hulu.com/movie/6012fa47-01c6-4341-b884-16d5eed8593a");
        Thread.sleep(2000);

        // Click on the watch button
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div/div[3]/div/div/div/div[4]/div/div[1]/a/div"))
                .click();
        Thread.sleep(10000);

        // Click on the pause button
        By pause = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[1]/div[1]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(pause));
        driver.findElement(pause).click();
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    void volumeSlider() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[1]/div[5]/div[1]"))
                .click();
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    void videoSettings() throws InterruptedException{
        // Click on the settings icon
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[3]"))
                .click();
        Thread.sleep(2000);

        // Click on subtitles and audio
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[1]/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on english subtitles
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]"))
                .click();
        Thread.sleep(2000);

        // Click back arrow
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[3]/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on the quality option
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[1]/div[2]"))
                .click();
        Thread.sleep(2000);

        // Click on the data saver option
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[2]"))
                .click();
        Thread.sleep(2000);

        // Click on the back arrow
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on the autoplay switch
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[1]/div[3]"))
                .click();
        Thread.sleep(2000);

        // Click on the settings icon
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[3]/div/div[1]/div[3]/div[2]/div[3]"))
                .click();
        Thread.sleep(2000);
    }

    @Test
    void screenSizeOptions() throws InterruptedException{
        // Click on the fullscreen button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[7]/div/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on the exit fullscreen button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[7]/div/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on the minimize button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[7]/div/div[2]"))
                .click();
        Thread.sleep(2000);

        // Click on the maximize button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[7]/div/div[1]"))
                .click();
        Thread.sleep(2000);

        // Click on the close button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div/div[5]/div[7]/div/div[3]"))
                .click();
        Thread.sleep(2000);
    }
}
