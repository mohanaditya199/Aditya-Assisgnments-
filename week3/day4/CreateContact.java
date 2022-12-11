package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunity);
		Thread.sleep(3000);
		
		
		WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accounts);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("aditya");
		Thread.sleep(2000);
		WebElement ownership = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		driver.executeScript("arguments[0].click();", ownership);
		Thread.sleep(2000);
		
		WebElement publicoption = driver.findElement(By.xpath("//span[contains(text(),'Public')]"));
		
		Actions obj= new Actions(driver);
		
		
		obj.keyDown(Keys.CONTROL).click(publicoption);
		driver.executeScript("arguments[0].click();", publicoption);
	     
	      Thread.sleep(3000);
		
	      driver.findElement(By.xpath("//button[text()='Save']")).click();
	      
	      
	      WebElement nameElement = driver.findElement(By.xpath("//lightning-formatted-text[text()='aditya']"));
			String name = nameElement.getText();
			
			if(name.equalsIgnoreCase("aditya")){
				System.out.println("Account created succesfully");
			}
			else{
				System.out.println("Account not created");
			}
	      
	      
	      
	      
	      
	      
	      
	      
		
	}

}
