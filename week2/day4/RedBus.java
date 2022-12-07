package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@data-id='122']")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
		Thread.sleep(3000);
		
		String buscount = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		
		System.out.println("Total bus count = "+ buscount);
		
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		String bus2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		
		System.out.println("2nd resulting Bus name : "+bus2);
		
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
