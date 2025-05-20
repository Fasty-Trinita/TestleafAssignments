package week2.day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesforceLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(7000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div/div[1]/div[1]/div/div/div[1]/one-app-launcher-header/button/div")).click();
		driver.quit();
	}
}