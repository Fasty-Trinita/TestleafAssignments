package week4.day2w4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://finance.yahoo.com/");

        // Hover on "More"
        WebElement mouseHover = driver.findElement(By.xpath("//span[text()='More']"));
        Actions hover = new Actions(driver);
        hover.moveToElement(mouseHover).perform();

        // Click on "Crypto"
        driver.findElement(By.xpath("//a[@class='_yb_m11dfa' and normalize-space(text())='Crypto']")).click();
        Thread.sleep(3000);

        // Print table headers
        List<WebElement> headers = driver.findElements(By.xpath("//div[contains(@class,'table-container')]/table/thead/tr/th"));
        System.out.println("Table Headers:");
        for (WebElement header : headers) {
            System.out.print(header.getText() + " | ");
        }
        System.out.println("\n----------------------");

        // Get all table rows from tbody
        List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr"));
        System.out.println("Total Rows: " + rows.size());

        // Loop rows and columns
        for (int i = 1; i <= rows.size(); i++) {
            for (int j = 1; j <= headers.size(); j++) {
                String cellValue = driver.findElement(By.xpath("//div[contains(@class,'table-container')]/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(cellValue + " | ");
            }
            System.out.println(); 
        }



        driver.quit();
    }
}
