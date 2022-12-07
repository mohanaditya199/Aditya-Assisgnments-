package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notiofications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();

		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		
		
		
		  List<WebElement> sname = driver.findElements(By.
		  xpath("//table[@class='table table-bordered table-condensed table-striped']/tbody//tr/td[3]"
		  ));
		  
		  int size = sname.size();
		  
		  System.out.println(size);
		  
		  
		  
			
			  List<String> securityname = new ArrayList<String>();
			  
			  for (WebElement sname2 : sname) { securityname.add(sname2.getText());
			  
			  System.out.println(sname2.getText());
			  
			  }
			  
			  Set<String> setsn = new LinkedHashSet<String>(securityname);
			  
			  int size2 = setsn.size(); System.out.println(size2);
			  
			  
			  if (size == size2) { System.out.println("no duplicates found"); } else {
			  System.out.println(" duplicates found"); }
			  
			 
		 
		  
		 

	}

}
