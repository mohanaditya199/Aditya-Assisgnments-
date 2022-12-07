package week3.day2;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

	
				java.util.List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
				int s=findElements.size();
				System.out.println(s);
				
				
				java.util.List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
				int s1=findElements2.size();
				System.out.println(s1);
				
		
		
		
	}

}
