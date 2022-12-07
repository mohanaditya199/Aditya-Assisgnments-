package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ADITYA");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BM");
		
		
		driver.findElement(By.name("description")).sendKeys("Test Description");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("aditya@gmail.com");
		
		WebElement sel1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		
		Select lst = new Select(sel1);
		
		lst.selectByVisibleText("New York");
		
		
	
		driver.findElement(By.className("smallSubmit")).click();
		

	}

}
