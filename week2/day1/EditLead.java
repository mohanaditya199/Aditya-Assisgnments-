package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aditya");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Bm");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='15493']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("View Lead | opentaps CRM")) 
		{
			System.out.println("Title matches");
		} 
		else 
		{
			System.out.println("Title does not match");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
        driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TEST LEAF UPDATE");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		

		boolean equals = driver.equals("TEST LEAF UPDATE  (15493)");
		
		if (equals) 
		{
			System.out.println("update failed");
		} 
		else 
		{
			System.out.println("update sucessfull");		
		}
		
		driver.close();
		
		
	}

}
