package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

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
		
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		Thread.sleep(3000);
		Set<String> windowset = driver.getWindowHandles();
		
		List<String> windowlist = new ArrayList<String>(windowset);
		
	
		System.out.println(windowlist.size());
		
		System.out.println(windowset);
		
		Thread.sleep(3000);
		driver.switchTo().window(windowlist.get(1));
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		Thread.sleep(3000);
		driver.switchTo().window(windowlist.get(0));
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		
		
		
		
		driver.close();
		
		
	
		
	}

}
