package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		if (currentUrl.contains("hyderabad")) {
			System.out.println("the url contains hyderabad");
		} else {
			System.out.println("the url doe not contain hyderabad");
		}
		
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Avatar");
		driver.findElement(By.xpath("//span[@class='sc-jhaWeW ChCae']")).click();
		
	
		
		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath("//span[text()='3D']")).click();
	    
	    String name = driver.findElement(By.xpath("//a[contains(@class,'__venue-name')]")).getText();
	   
	    System.out.println("First Theatre name is "+name);
	    
	    driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		driver.findElement(By.xpath("(//div[@class='venue-info-text'])[1]")).click();
		 String facility = driver.findElement(By.xpath("(//div[@class='facility-text'])[4]")).getText();
		    
		    if (facility.equalsIgnoreCase("Parking Facility")) {
				System.out.println("parking facility available");
			} else {
				System.out.println("parking facility  not available");
			}
		
		    driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		    driver.findElement(By.xpath("//a[@class='showtime-pill']")).click();
		
		    
		    //js
		  WebElement cli = driver.findElement(By.id("btnPopupAccept"));
		  
		   driver.executeScript("argument[0].click();", cli);
		
		    driver.findElement(By.xpath("//li[text()='1']")).click();
		
		    driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
		
		    driver.findElement(By.xpath("//a[@class='_available']")).click();
		    
		    driver.findElement(By.xpath("//a[@id='btmcntbook']")).click();
		    
		    String subt = driver.findElement(By.xpath("//span[@id='subTT']")).getText();
		    
		    System.out.println("Subtotal = "+subt);
		    
		    
	}

}
