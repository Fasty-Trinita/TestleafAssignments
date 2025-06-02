package week4.day1w4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WinHandelingAss {

public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login LeafTaps site	
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
		Thread.sleep(3000);
		
		//Click on Contacts tab and select Merge contact
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_contacts']/following::img")).click();
		
		//Get all windows and change set to list
		Set<String> win1 = driver.getWindowHandles();
		//System.out.println("All windows: "+allWindows);
		List<String> getWindow = new ArrayList<String>(win1);
		
		//Focus on new opened window and select 1st value
		driver.switchTo().window(getWindow.get(1));
		driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
		
		//Move to parent window   
		driver.switchTo().window(getWindow.get(0));
		
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//div[@id='sectionHeaderTitle_contacts']/following::img)[2]")).click();
	    Thread.sleep(3000);
	    
	    //Focus on 2nd window and select 2nd value
	    Set<String> win2 = driver.getWindowHandles();
	    List<String> getWindow1 = new ArrayList<String>(win2);
		driver.switchTo().window(getWindow1.get(1));
		driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
		driver.switchTo().window(getWindow1.get(0));
	
		//Parent window - Merge
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
				
		String title = driver.getTitle();
		System.out.println("Title of the page is :" +title);
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
