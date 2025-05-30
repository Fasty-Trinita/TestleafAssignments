package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBags {
	public static void main(String[] args) {
		
		//Opening Chrome and getting the website
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.amazon.in/");
		
		//searching for Bags for boy
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Bags for boys" +Keys.ENTER);
		
		//Printing the total no of results 
		String result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(result);
		
		//check the 1st two brands from the brands checkbox
		driver.findElement(By.id("brandsRefinements"));
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		
		//clicking on New Arrivals dropdown
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		WebElement newarr = driver.findElement(By.linkText("Newest Arrivals"));
		newarr.click();
		System.out.println(newarr);
		//Getting the product name of the 1st product
		String productTitle = driver.findElement(By.xpath("//h2[@aria-label='Verge 37L Casual Printed Backpack, "
				+ "3 Compartments, Raincover, Armor Base, Organizer, Bottle Holder, Front Pocket, School Bag for Boys and Girls, College Bag, Office Bag, Travel Bag']")).getText();
		String productPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText();
		System.out.println("Product Title: " + productTitle + "\nProduct Price: ₹" + productPrice);
		//getting the title of the webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//to close the window
		driver.quit();

	}

}
