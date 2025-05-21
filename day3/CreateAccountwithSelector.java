package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		//launch the chrome browser
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Abiee Fasty Trinita");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement option = driver.findElement(By.name("industryEnumId"));
		Select opti = new Select(option);
		opti.selectByValue("IND_SOFTWARE");
		//SelectByVisibleText
		WebElement option1 = driver.findElement(By.name("ownershipEnumId"));
		Select opt1 = new Select(option1);
		opt1.selectByVisibleText("S-Corporation");
		//SelectByValue
		WebElement option2 = driver.findElement(By.id("dataSourceId"));
		Select opt2 = new Select(option2);
		opt2.selectByValue("LEAD_EMPLOYEE");
		//SelectByIndex
		WebElement option3 = driver.findElement(By.id("marketingCampaignId"));
		Select opt3 = new Select(option3);
		opt3.selectByIndex(6);
		//SelectByValue
		WebElement option4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select opt4 = new Select(option4);
		opt4.selectByValue("TX");
		//click on create Account
		driver.findElement(By.className("smallSubmit")).click();	
		//To get the title
		String title = driver.getTitle();
		System.out.println(title);
		//to close the browser
		driver.quit();
	}

}
