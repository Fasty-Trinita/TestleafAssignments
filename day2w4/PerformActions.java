package week4.day2w4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PerformActions {

    public static void main(String[] args) throws InterruptedException, IOException {
        // Set Chrome options
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--guest");
        opt.addArguments("--disable-notifications");

        // Pass options to ChromeDriver
        ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.snapdeal.com/");
        
        // Mouse hover on 'Men'
        WebElement mouseHover = driver.findElement(By.xpath("//span[contains(text(), 'Men')]"));
        Actions mouseH = new Actions(driver);
        mouseH.moveToElement(mouseHover).perform();
        
        // Click on 'Shirts'
        driver.findElement(By.xpath("(//span[text()='Shirts'])[1]")).click();
        Thread.sleep(3000); // Wait for shirts to load

        // Mouse hover on first shirt image
        WebElement shirt = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
        mouseH.moveToElement(shirt).perform();
        Thread.sleep(4000);

        // Take screenshot
        File ss = driver.getScreenshotAs(OutputType.FILE);
        File ssPath = new File("./snaps/img.png");
        FileUtils.copyFile(ss, ssPath);

        // Clean up
        driver.quit();
    }
}
