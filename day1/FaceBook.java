package week2.day1;

import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aditya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bm");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aditya@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("aditya1");
		
		
		WebElement dobday = driver.findElement(By.id("day"));
		Select date = new Select(dobday);
		date.selectByVisibleText("12");
		
		WebElement dobmon = driver.findElement(By.id("month"));
		Select month = new Select(dobmon);
		month.selectByVisibleText("Mar");
		
		
		WebElement dobyr = driver.findElement(By.id("year"));
		Select year = new Select(dobyr);
		year.selectByVisibleText("2012");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
	}

}
