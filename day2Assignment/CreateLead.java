package week2.day2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Fasty");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Trinita");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestleafProj");
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}
}
