package week4.day2w4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealActions {

	private static String text;

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
        
        //click on Sports Shoes
        driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        Thread.sleep(2000);
        
        //print Shoe Count
        String shoeCount = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println("Total No of Sports Shoe: " + shoeCount);
        
        //Click on Training Shoes
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
        driver.findElement(By.xpath("//li[@class='search-li'][1]")).click();
        Thread.sleep(2000);
        
        //print all display prices 
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        List<Integer> actualPrice = new ArrayList<Integer>();
        
        for (WebElement i : prices) {
        	String PriceText = i.getText().replaceAll("[^0-9]", "");
        	if (!PriceText.isEmpty()) {
        		actualPrice.add(Integer.parseInt(PriceText));
        	}
			
		}
        
        System.out.println("Print the Prices: " +actualPrice);
        
        //Select Price Range
        driver.findElement(By.name("fromVal")).clear();
        driver.findElement(By.name("fromVal")).sendKeys("500");
        driver.findElement(By.name("toVal")).clear();
        driver.findElement(By.name("toVal")).sendKeys("700");
        //driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
        driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
        
        WebElement hoverShoe = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
        mouseH.moveToElement(hoverShoe).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[contains(@class,'quick-view-bar')])[1]")).click();
        Thread.sleep(3000);
        
        //print the Price of the shoe 
        String getPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("Print the Price of the shoe:"+ getPrice);
        Thread.sleep(2000);
        
        //snapshot of the page
        File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
        File SS = new File("./snaps/Snapdeal.png");
        FileUtils.copyFile(screenshotAs, SS);

        //Close browser
        driver.quit();
        
        

	}

}
