package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eraill {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("ms");
		
		driver.findElement(By.xpath("//div[@class='selected']")).click();
		
		
driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("co");
		
		driver.findElement(By.xpath("(//div[@class='selected'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		
		List<WebElement> name = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
		
		
		int size = name.size();
		
		System.out.println(size);
		
		

List<String> trainname = new ArrayList<String>();
		
		for (WebElement train : name) {
			trainname.add(train.getText());
			
			System.out.println(train.getText());
			
		}
			
			Set<String> tr = new LinkedHashSet<String>(trainname);
			
			int size2 = tr.size();
			System.out.println(size2);
			
			
		if (size == size2) {
			System.out.println("no duplicates found");
		} else {
			System.out.println(" duplicates found");
		}
		
		
		
		
	}

}
