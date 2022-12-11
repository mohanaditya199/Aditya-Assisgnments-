package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Testleaf$321");
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		Thread.sleep(3000);
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		Shadow sh= new Shadow(driver);
		sh.findElementByXPath("//span[text()='Learning']").click();
		
		WebElement lot = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Thread.sleep(3000);

		Actions obj = new Actions(driver);
		obj.moveToElement(lot).perform();
		
		Thread.sleep(3000);
		
		sh.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		
		driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		if (currentUrl.equalsIgnoreCase("https://trailhead.salesforce.com/en/credentials/architectoverview/")) {
			           System.out.println("url is correct");
		} else {
						System.out.println("url is not correct");
		}
		
		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text')]")).getText();
		System.out.println(summary);
		
		List<WebElement> cert1 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		int size1=cert1.size();
		System.out.println(size1);
		
			for (int i = 0; i < cert1.size(); i++) {
			
			WebElement certnames1 = cert1.get(i);
			String text1 = certnames1.getText();
			System.out.println(text1);
		}
		
			driver.findElement(By.linkText("Application Architect")).click();
		
			
			
			
			List<WebElement> cert2 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
			int size2=cert2.size();
			System.out.println(size2);
			
				for (int i = 0; i < cert2.size(); i++) {
				
				WebElement certnames2 = cert2.get(i);
				String text2 = certnames2.getText();
				System.out.println(text2);
			}
			
			
			
				
				
	
		
		
		
	}

}
