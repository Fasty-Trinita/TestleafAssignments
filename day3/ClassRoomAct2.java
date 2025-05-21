package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClassRoomAct2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}

}
