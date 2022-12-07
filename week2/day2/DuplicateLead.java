package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='button']//img)")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[3]")).click();
		
		
	
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("aditya19@gmail.com");
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		
		String str1 = driver.findElement(By.xpath("//a[text()='ADi']")).getText();
		
		System.out.println(str1);
		
			
		
		String  str2 = driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=15937'])[2]")).getText();
		
		System.out.println(str2);
	
		driver.findElement(By.xpath("(//a[@href='/crmsfa/control/viewLead?partyId=15937'])[2]")).click();
		
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
	
		String title = driver.getTitle();
		
		System.out.println(title);
	
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title correct");
		} else {
			System.out.println("Title wrong");
		}
	
		driver.findElement(By.className("smallSubmit")).click();
		
		String str3 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	
		if (str1.equals(str3)) {
						System.out.println("duplicate sucessful");
		} else {
			System.out.println("duplicate not sucessful");
		}
	
	
	
}

}
