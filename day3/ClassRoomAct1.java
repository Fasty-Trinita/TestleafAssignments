package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ClassRoomAct1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		WebElement dd1 = driver.findElement(By.name("DropdownListFieldController_0"));
		WebElement dd2 = driver.findElement(By.name("DropdownListFieldController"));
		WebElement dd3 = driver.findElement(By.name("DynamicListFieldController"));
		
		Select option1 = new Select(dd1);
		option1.selectByIndex(5);
		Thread.sleep(2000);
		
		Select option2 = new Select(dd2);
		option2.selectByVisibleText("UI for React");
		Thread.sleep(2000);
		
		Select option3 = new Select(dd3);
		option3.selectByValue("France");
		Thread.sleep(2000);
		
		driver.findElement(By.name("TextFieldController")).sendKeys("Abiee");
		driver.findElement(By.name("TextFieldController_0")).sendKeys("Fasty");
		driver.findElement(By.name("TextFieldController_1")).sendKeys("TestLeaf");
		driver.findElement(By.name("EmailTextFieldController")).sendKeys("trinita.aft.96@gmail.com");
		driver.findElement(By.name("TextFieldController_2")).sendKeys("9546325556");
		driver.findElement(By.name("ParagraphTextFieldController")).sendKeys("Completed My Task");
		
		driver.quit();
	}

}
