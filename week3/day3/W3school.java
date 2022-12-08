package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3school {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().sendKeys("Aditya");
		
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(text);
		
		if (text.equalsIgnoreCase("Hello Aditya! How are you today?")) {
			System.out.println("name matches");
		} else {
			System.out.println("name does not match");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
