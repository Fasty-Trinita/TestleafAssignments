package week4.day2w4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		
		//searching for oneplus 9 pro
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro" +Keys.ENTER);
		
		//Printing the total no of results 
		String firstProd = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Price of the First prod: "+firstProd);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base a-color-secondary totalRatingCount']")).getText();
		System.out.println("Print the total no of Ratings: "+rating);
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")).click();
		
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> getWindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(getWindow.get(1));
		Thread.sleep(2000);
		
		File Screenshot = driver.getScreenshotAs(OutputType.FILE);
		File ss = new File("./snaps/Amazon.png");
		FileUtils.copyFile(Screenshot, ss);
		
		driver.quit();

	}

}
