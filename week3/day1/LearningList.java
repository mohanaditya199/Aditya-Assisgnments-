package week3.day1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningList {

	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("How many links in this page?")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int size = links.size();
		System.out.println("total no of links = "+ size);
		
		
		
		for (int i = 0; i < links.size(); i++) {
			
			WebElement linktext = links.get(i);
			String text = linktext.getText();
			System.out.println(text);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
