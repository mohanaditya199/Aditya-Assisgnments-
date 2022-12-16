package week4.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateOpportunitywithoutmandatoryfields extends BasicClass{

	
	@Test
	public void CreNewOppwomf() throws InterruptedException {
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	
		WebElement opportunity = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", opportunity);
		Thread.sleep(3000);
	
	
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
	
	
		WebElement date = driver.findElement(By.xpath("//input[@name='CloseDate']"));
		driver.executeScript("arguments[0].click();", date);
		
		Thread.sleep(3000);
	
		WebElement cdate = driver.findElement(By.xpath("//span[text()='15']"));
	
		driver.executeScript("arguments[0].click();", cdate);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	
		
		List<WebElement> error = driver.findElements(By.xpath("//div[text()='Complete this field.']"));
		List<String> errorList = new ArrayList<String>();
		for (WebElement i : error) {
			String text = i.getText();
			errorList.add(text);
		}
		System.out.println(errorList);
		Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
