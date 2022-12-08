package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnNestedframe {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		
		// To enter Parent frame
				driver.switchTo().frame("frame1");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Adi");
			//To enter Child frame
				Thread.sleep(3000);
				driver.switchTo().frame("frame3");
				Thread.sleep(3000);
				driver.findElement(By.id("a")).click();
				
		
		
		
		
		
		
		
		
		
		

	}

}
