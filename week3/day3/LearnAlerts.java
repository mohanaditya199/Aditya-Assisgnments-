package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//simple alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String youHaveSuccessfully = driver.findElement(By.id("simple_result")).getText();
		System.out.println(youHaveSuccessfully);
		
		//confirm alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String userClicked = driver.findElement(By.id("result")).getText();
		System.out.println(userClicked);
		
		//prompt alert
		
		Thread.sleep(3000);		
		driver.findElement(By.xpath("(//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-success']//span)[2]")).click();
		
		driver.switchTo().alert().sendKeys("prompt alert msg");
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String userEnteredName = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(userEnteredName);
		
		//Sweet Alert (Simple Dialog)
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		// Sweet Modal Dialog
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt100']/span)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//Sweet Alert (Confirmation)
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//Minimize and Maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@name='j_idt88:j_idt111']//span)[2]")).click();
		//Maximize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		//minimize
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		
		
		
		

	}

}
