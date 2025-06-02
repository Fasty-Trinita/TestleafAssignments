package week4.day1w4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[2]")).click();
		Thread.sleep(3000);
		
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		List<String> getWindow = new ArrayList<String>(allWindow);
		driver.switchTo().window(getWindow.get(1));
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		driver.close();
		
		driver.switchTo().window(getWindow.get(0));
		driver.quit();
	}

}
