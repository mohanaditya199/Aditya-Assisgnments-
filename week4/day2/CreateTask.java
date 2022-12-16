package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask extends BasicClass{
	
	//packagename.classname.methodname
			@Test(dependsOnMethods="week4.day2.ArchitectCertifications.ArchCert")
	public void CreTask() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='slds-input']"));
		search.click();
		search.sendKeys("task");

		Thread.sleep(2000);
		
		WebElement tasks = driver.findElement(By.xpath("//span[@class='slds-truncate label-display']"));
		driver.executeScript("arguments[0].click();", tasks);

		WebElement dropdown = driver.findElement(By.xpath("//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']"));
		driver.executeScript("arguments[0].click();", dropdown);


		WebElement newTask = driver.findElement(By.xpath("//div[text()='New Task']"));
		driver.executeScript("arguments[0].click();", newTask);

		Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']"));
		subject.click();
		subject.sendKeys("bootcamp");
		
		WebElement status = driver.findElement(By.xpath("//a[@class='select']"));
		driver.executeScript("arguments[0].click();", status);

		WebElement waiting = driver.findElement(By.xpath("//a[text()='Waiting on someone else']"));
		driver.executeScript("arguments[0].click();", waiting);
	
		
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		Thread.sleep(5000);
		WebElement task = driver.findElement(By.xpath("//div[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']"));
		String name = task.getText();
		
		if(name.equalsIgnoreCase("bootcamp")){
			System.out.println("Task created succesfully");
		}
		else{
			System.out.println("Task not created");
		}
		
		
		
		
		
		
		
		
		

	}

}
