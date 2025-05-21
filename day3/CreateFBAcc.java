package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Evangeline");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Blessy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9344552360");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Blessy@9699");
		
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		Select dat = new Select(Date);
		dat.selectByValue("9");
		
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(Month);
		mon.selectByVisibleText("Jul");
		
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yr = new Select(Year);
		yr.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.quit();
		

	}

}
