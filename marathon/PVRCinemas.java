package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome and open PVR Cinemas website
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.pvrcinemas.com/");
        
        Thread.sleep(3000); // Wait for the site to load

        // Click on 'Cinema'
        driver.findElement(By.xpath("//span[text()='Cinema']")).click();
        Thread.sleep(2000);

        // Select cinema location
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
        driver.findElement(By.xpath("//span[text()='INOX The Marina Mall, OMR, Chennai']")).click();
        Thread.sleep(3000);

        // Select tomorrow's date
        driver.findElement(By.xpath("(//span[contains(@class, 'p-dropdown-label')])[3]")).click();
        driver.findElement(By.xpath("(//ul[contains(@class,'p-dropdown-items')]/li)[2]")).click();
        Thread.sleep(2000);

    
        // Open the movie dropdown
        //driver.findElement(By.xpath("(//span[contains(@class, 'p-dropdown-label')])[4]")).click();
        //Thread.sleep(1000);  // Small wait for options to appear

        // Click on the specific movie
        driver.findElement(By.xpath("(//span[text()='TOURIST FAMILY'])[2]")).click();
        Thread.sleep(2000);

        // Select time
        driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();
        Thread.sleep(2000);

        // Click on the 'Book' button
        driver.findElement(By.xpath("//button[@class='p-button p-component sc-hORkcV gUVSfS bgColor filter-btn']")).click();
        Thread.sleep(3000);
        //Accept the sweet alert
        driver.findElement(By.xpath("//button[@class='sc-kfeOyU hsmcHs reject-terms']")).click();
        
        //Select Seat
        driver.findElement(By.xpath("(//span[text()='14' and @class='seat-current-pvr'])[5]")).click();
        //select proceed
        driver.findElement(By.xpath("//button[@class='sc-dJkDXt bWYhCG btn-proceeded']")).click();
        Thread.sleep(2000);
        
        String seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
        System.out.println(seatInfo);
        Thread.sleep(2000);
        
        String grandTotal = driver.findElement(By.xpath("//div[@class='all-grand']")).getText();
        System.out.println(grandTotal);
        Thread.sleep(2000);
        
        //click continue
        driver.findElement(By.xpath("//button[@class = 'fb-added-btndesk']")).click();
        driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
        Thread.sleep(2000);
        
        String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
	
        // Close browser
        driver.quit();
    }
}
